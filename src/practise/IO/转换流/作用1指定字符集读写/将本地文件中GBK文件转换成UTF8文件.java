package practise.IO.转换流.作用1指定字符集读写;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class 将本地文件中GBK文件转换成UTF8文件 {
    public static void main(String[] args) throws IOException {

        //过时的方法
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("lib/txt/Chinese.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("lib/txt/ChineseUTF8.txt"),"UTF-8");
        int ch;
        while ((ch = isr.read()) != -1){
            osw.write(ch);
        }
        osw.close();
        isr.close();*/

        //使用GBK读取文件
        FileReader fr = new FileReader("lib/txt/Chinese.txt", Charset.forName("GBK"));
        //使用UTF-8写入文件
        FileWriter fw = new FileWriter("lib/txt/ChineseUTF8.txt", Charset.forName("UTF-8"));
        int ch;
        while((ch = fr.read()) != -1){
            fw.write(ch);
        }
        fw.close();
        fr.close();






    }
}
