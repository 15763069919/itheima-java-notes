package practise.IO.输出流.FileOutputStream.三种输出数据的方式;

import java.io.FileOutputStream;
import java.io.IOException;

public class 一次写一个字节数组的部分数据 {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("lib/txt/a.txt");
        byte[] bytes = {97,98,99,100,101,102,103};
        file.write(bytes,1,4);
    }
}
