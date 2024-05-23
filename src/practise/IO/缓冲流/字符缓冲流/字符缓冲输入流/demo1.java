package practise.IO.缓冲流.字符缓冲流.字符缓冲输入流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        //1. 创建字符缓冲输入流的对象
        BufferedReader br = new BufferedReader(new FileReader("lib/txt/a.txt"));
        //2.特有方法 -- 读取整行数据
        //遇到回车换行结束，不会读取回车换行到内存中
        /*String line = br.readLine();
        System.out.println(line);*/

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        //3.释放资源
        br.close();
    }
}
