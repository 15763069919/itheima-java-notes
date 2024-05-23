package practise.IO.comprehensiveExercises;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class 修改文件中的数据常规方式 {
    public static void main(String[] args) throws IOException {
        //1.读取数据
        FileReader fr = new FileReader("lib/txt/a.txt");
        int ch;
        StringBuilder sb = new StringBuilder();
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        fr.close();
        System.out.println(sb);
       //2.排序
        String[] strings = sb.toString().split("-");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : strings) {
            int i = Integer.parseInt(s);
            //添加到集合
            list.add(i);
        }
        System.out.println(list);
        //排序
        Collections.sort(list);
        System.out.println(list);
        //3.写出数据
        FileWriter fw = new FileWriter("lib/txt/a.txt");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1){
                fw.write(list.get(i)+"");
            }else {
                fw.write(list.get(i)+"-");
            }
        }
        fw.close();
    }
}
