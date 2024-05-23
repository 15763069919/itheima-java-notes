package practise.IO.缓冲流.字符缓冲流.字符缓冲输出流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        //1.创建字节缓冲输出流的对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("lib/txt/b.txt",true));
        //2.写出数据
        bw.write("你嘴角上扬的样子百度搜索不到");
        //换行
        bw.newLine();
        bw.write("哈哈哈哈");
        bw.newLine();
        //3.释放资源
        bw.close();
    }
}
