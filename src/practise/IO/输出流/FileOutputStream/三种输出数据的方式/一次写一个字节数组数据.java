package practise.IO.输出流.FileOutputStream.三种输出数据的方式;

import java.io.FileOutputStream;
import java.io.IOException;

public class 一次写一个字节数组数据 {
    public static void main(String[] args) throws IOException {
        //1。创建对象
        FileOutputStream fos = new FileOutputStream("lib/txt/a.txt");
        byte[] bytes = {97,98,99};
        fos.write(bytes);


        //3. 释放资源
        fos.close();
    }
}
