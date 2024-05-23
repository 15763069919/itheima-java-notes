package practise.IO.comprehensiveExercises;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class 修改文件中的数据非常规方式 {
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
        //把字符串数组变为stream流
        Integer[] array = Arrays.stream(sb.toString().split("-"))
                //转换成整数
                .map(Integer::parseInt)
                //排序
                .sorted()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
        //3.写出数据
        FileWriter fw = new FileWriter("lib/txt/a.txt");
        //将数组转换为字符串，并把字符串中的逗号空格转换为横杠 [1, 2, 4, 7, 8, 9]
        String s = Arrays.toString(array).replace(", ", "-");
        //去掉首尾的括号 -- 字符串截取  [1-2-4-7-8-9]
        String result = s.substring(1, s.length() - 1);
        //写入文件
        fw.write(result);
        //释放资源
        fw.close();
    }
}
