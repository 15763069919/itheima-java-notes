package practise.IO.输出流.FileOutputStream.换行写和续写;

import java.io.FileOutputStream;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {

        //第二个参数：是否续写
        FileOutputStream fos = new FileOutputStream("lib/txt/d.txt",true);
        String str1 = "kankelaoyehaoshuai";
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes1);

        //换行
        String str2 = "\r\n";
        byte[] bytes2 = str2.getBytes();
        fos.write(bytes2);

        String str3 = "666";
        byte[] bytes3 = str3.getBytes();
        fos.write(bytes3);

        fos.close();
    }
}
