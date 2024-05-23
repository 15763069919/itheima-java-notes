package practise.IO.转换流.作用2字节流使用字符流的方法;

import java.io.*;

public class demo1 {
    public static void main(String[] args) throws IOException {
        /*
        * 利用字节流读取文件中的数据，每次读一行，而且不能出现乱码
        *
        * 1.读取中文：字节流 -- 乱码，字符流 -- 不乱码
        * 2.读取一行：字节流 -- 不能，字符缓冲流 -- 能
        * */

        //创建字节流对象
        FileInputStream fis = new FileInputStream("lib/txt/a.txt");
        //创建转换流对象，将字节流包装成字符流进行读取，防止读取乱码
        InputStreamReader isr = new InputStreamReader(fis);
        //创建字符缓冲流对象，将字符流包装成字符缓冲流，使能够一次读取一行
        BufferedReader br = new BufferedReader(isr);

       /* 可以简化成：
        * BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream("lib/txt/a.txt")));
        */

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
