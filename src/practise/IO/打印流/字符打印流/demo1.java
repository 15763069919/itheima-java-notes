package practise.IO.嬉咫送.忖憲嬉咫送;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class demo1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new FileOutputStream("lib/txt/a.txt"),true, Charset.forName("GBK"));
        pw.println("込込込込込込込込込込込");
        pw.close();
        System.out.println();
    }
}
