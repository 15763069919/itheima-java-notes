package practise.IO.��ӡ��.�ַ���ӡ��;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class demo1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new FileOutputStream("lib/txt/a.txt"),true, Charset.forName("GBK"));
        pw.println("����������������������");
        pw.close();
        System.out.println();
    }
}
