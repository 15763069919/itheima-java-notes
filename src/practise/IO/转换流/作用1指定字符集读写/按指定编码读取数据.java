package practise.IO.转换流.作用1指定字符集读写;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class 按指定编码读取数据 {
    public static void main(String[] args) throws IOException {
        //过时
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("lib/txt/Chinese.txt"),"GBK");
        int ch;
        while ((ch = isr.read()) != -1){
            System.out.print((char)ch);
        }
        isr.close();*/

        //替代方案
        FileReader fr = new FileReader("lib/txt/Chinese.txt", Charset.forName("GBK"));
        int ch;
        while ((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }

    }
}
