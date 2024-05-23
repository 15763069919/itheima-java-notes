package practise.IO.转换流.作用1指定字符集读写;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class 按照指定编码写出数据 {
    public static void main(String[] args) throws IOException {
        //过时
        /*OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("lib/txt/Chinese.txt"),"GBK");
        osw.write("你好好你好");
        osw.close();*/

        //替代
        FileWriter fw = new FileWriter("lib/txt/Chinese.txt", Charset.forName("GBK"));
        fw.write("你好个蛋");
        fw.close();

    }
}
