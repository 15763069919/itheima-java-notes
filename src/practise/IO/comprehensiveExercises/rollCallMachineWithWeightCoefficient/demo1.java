package practise.IO.comprehensiveExercises.rollCallMachineWithWeightCoefficient;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) throws IOException {
        //1.把文件中的学生信息读取到内存中，封装成学生对象，在放在集合里
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("src/practise/IO/comprehensiveExercises/rollCallMachineWithWeightCoefficient/names.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("-");
            Student s = new Student();
            s.setName(arr[0]);
            s.setGender(arr[1]);
            s.setAge(Integer.parseInt(arr[2]));
            s.setWeight(Double.parseDouble(arr[3]));
            list.add(s);
//            System.out.println(line);
        }
        br.close();
        System.out.println(list);

        //2.计算权重的占比 -- 先计算权重的综合
        double weight = 0;
        for (Student student : list) {
            weight += student.getWeight();
        }
        System.out.println(weight);

        //3.计算每一个人的权重实际占比
        double[] arr = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i).getWeight()/weight;
        }
        System.out.println(Arrays.toString(arr));

        //4.计算每一个人的权重占比范围
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
        }
        System.out.println(Arrays.toString(arr));

        //5.随机抽取
        double number = Math.random(); //获取一个0.0~1.0之间的随机数
        System.out.println(number);
        //判断number在arr的区间 -- 二分查找法 -- 方法返回：-插入点-1   //插入点指的是索引
        //获取number在数组的插入点位置（索引）： 结果 = -插入点-1
        //                           插入点 = -结果-1
        int result = -Arrays.binarySearch(arr, number)-1;
        System.out.println(result);
        Student stu = list.get(result);
        System.out.println(stu);

        //6.修改当前的权重
        double w = stu.getWeight() / 2;
        stu.setWeight(w);
        System.out.println(list);

        //7.把集合中的数据写到文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/practise/IO/comprehensiveExercises/rollCallMachineWithWeightCoefficient/names.txt"));
        for (Student student : list) {
            bw.write(student.toString());
            bw.newLine();
        }
        bw.close();
    }
}
