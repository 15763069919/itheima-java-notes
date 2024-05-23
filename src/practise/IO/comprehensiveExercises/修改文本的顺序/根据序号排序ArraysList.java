package practise.IO.comprehensiveExercises.修改文本的顺序;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class 根据序号排序ArraysList {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader("lib/txt/csb.txt"));
        //读取
        String line;
        ArrayList<String> list = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            //添加进集合
            list.add(line);
        }
        System.out.println(list);
        br.close();

        //排序
//        Collections.sort(list, (o1, o2) -> Integer.parseInt(o1.split("\\.")[0]) - Integer.parseInt(o2.split("\\.")[0]));
        list.sort(Comparator.comparingInt(o -> Integer.parseInt(o.split("\\.")[0])));

        System.out.println(list);

        //写入
        BufferedWriter bw = new BufferedWriter(new FileWriter("lib/dest/csb.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }

        bw.close();
    }
}
