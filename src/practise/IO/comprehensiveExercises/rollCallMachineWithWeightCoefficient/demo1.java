package practise.IO.comprehensiveExercises.rollCallMachineWithWeightCoefficient;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) throws IOException {
        //1.���ļ��е�ѧ����Ϣ��ȡ���ڴ��У���װ��ѧ�������ڷ��ڼ�����
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

        //2.����Ȩ�ص�ռ�� -- �ȼ���Ȩ�ص��ۺ�
        double weight = 0;
        for (Student student : list) {
            weight += student.getWeight();
        }
        System.out.println(weight);

        //3.����ÿһ���˵�Ȩ��ʵ��ռ��
        double[] arr = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i).getWeight()/weight;
        }
        System.out.println(Arrays.toString(arr));

        //4.����ÿһ���˵�Ȩ��ռ�ȷ�Χ
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
        }
        System.out.println(Arrays.toString(arr));

        //5.�����ȡ
        double number = Math.random(); //��ȡһ��0.0~1.0֮��������
        System.out.println(number);
        //�ж�number��arr������ -- ���ֲ��ҷ� -- �������أ�-�����-1   //�����ָ��������
        //��ȡnumber������Ĳ����λ�ã��������� ��� = -�����-1
        //                           ����� = -���-1
        int result = -Arrays.binarySearch(arr, number)-1;
        System.out.println(result);
        Student stu = list.get(result);
        System.out.println(stu);

        //6.�޸ĵ�ǰ��Ȩ��
        double w = stu.getWeight() / 2;
        stu.setWeight(w);
        System.out.println(list);

        //7.�Ѽ����е�����д���ļ���
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/practise/IO/comprehensiveExercises/rollCallMachineWithWeightCoefficient/names.txt"));
        for (Student student : list) {
            bw.write(student.toString());
            bw.newLine();
        }
        bw.close();
    }
}
