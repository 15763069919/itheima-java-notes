package practise.IO.��ӡ��.�ֽڴ�ӡ��;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class demo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintStream ps = new PrintStream(new FileOutputStream("lib/txt/a.txt"),true, Charset.forName("GBK"));
        ps.println(97); //д��+�Զ�ˢ��+�Զ�����
        ps.print(true);
        ps.println();
        ps.printf("%s������%s","����","��ǿ");
        ps.close();
    }
}
