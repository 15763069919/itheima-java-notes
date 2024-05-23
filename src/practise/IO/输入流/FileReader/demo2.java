package practise.IO.输入流.FileReader;

import java.io.FileReader;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("lib/txt/a.txt");
        int len;
        char[] chars = new char[2];
        while ((len = fr.read(chars)) != -1){
            //把数据转成字符串再进行打印
            System.out.print(new String(chars,0,len));
        }
        //释放资源
        fr.close();
    }
}
