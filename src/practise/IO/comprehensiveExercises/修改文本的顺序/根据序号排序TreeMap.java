package practise.IO.comprehensiveExercises.修改文本的顺序;

import java.io.*;
import java.util.Set;
import java.util.TreeMap;

public class 根据序号排序TreeMap {

    public static void main(String[] args) throws IOException {
        //创建字符缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader("lib/txt/csb.txt"));
        //读取并自动排序
        String line;
        TreeMap<Integer,String> tm = new TreeMap<>();
        while ((line = br.readLine()) != null) {
            //添加进集合
            tm.put(Integer.parseInt(line.split("\\.")[0]),line.split("\\.")[1]); //自动排序
        }
        br.close();
        System.out.println(tm);

        //写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("lib/dest/csb.txt"));
        Set<Integer> integers = tm.keySet();
        for (Integer integer : integers) {
            bw.write(integer+"."+tm.get(integer));
            bw.newLine();
        }
        bw.close();
    }

}
