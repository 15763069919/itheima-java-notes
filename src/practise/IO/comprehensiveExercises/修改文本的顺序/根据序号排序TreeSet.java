package practise.IO.comprehensiveExercises.修改文本的顺序;

import java.io.*;
import java.util.TreeSet;

public class 根据序号排序TreeSet {

    public static void main(String[] args) throws IOException {
        //创建字符缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader("lib/txt/csb.txt"));
        //读取并自动排序
        String line;
        TreeSet<String> treeSet = new TreeSet<>();
        while ((line = br.readLine()) != null) {
            //添加进集合
            treeSet.add(line); //自动排序
        }
        br.close();
        System.out.println(treeSet);

        //写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("lib/dest/csb.txt"));
        for (String s : treeSet) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }

}
