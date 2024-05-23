package practise.IO.打印流.字节打印流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class demo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintStream ps = new PrintStream(new FileOutputStream("lib/txt/a.txt"),true, Charset.forName("GBK"));
        ps.println(97); //写出+自动刷新+自动换行
        ps.print(true);
        ps.println();
        ps.printf("%s爱上了%s","阿珍","阿强");
        ps.close();
    }
}
