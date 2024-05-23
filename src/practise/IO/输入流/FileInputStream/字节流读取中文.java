package practise.IO.输入流.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class 字节流读取中文 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("lib/txt/a.txt");
        int b;  //记录每一个字节数据
        while ((b = fis.read()) != -1){
            System.out.println((char)b);
        }
        fis.close();
    }
}
