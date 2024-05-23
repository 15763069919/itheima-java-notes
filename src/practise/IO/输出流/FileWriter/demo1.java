package practise.IO.输出流.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("lib/txt/a.txt"/*,true*/);
       /* String str = "你好威啊？？？";
        fw.write(str);*/

      /*  String str = "你好威啊？？？";
        fw.write(str,1,str.length()-1);*/

        /*char[] chars = {'a','b','我'};
        fw.write(chars);*/
/*
        char[] chars = {'a','b','我'};
        fw.write(chars);
        fw.close();*/


    }
}
