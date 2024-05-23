package practise.IO.输入流.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class 读取操作 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("lib/txt/a.txt");
        int b1 = fis.read();
        System.out.println((b1));
        System.out.println(((char)b1));
        int b2 = fis.read();
        System.out.println(b2);
        System.out.println(((char)b2));
        int b3 = fis.read();
        System.out.println(b3);
        System.out.println(((char)b3));
        int b4 = fis.read();
        System.out.println(b4);
        System.out.println(((char)b4));
        int b5 = fis.read();
        System.out.println(b5);
        System.out.println(((char)b5));


        fis.close();
    }
}
