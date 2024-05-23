package practise.IO.输入流.FileReader;

import java.io.FileReader;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        //1.创建对象
        FileReader fr = new FileReader("lib/txt/a.txt");
        //2.读取数据
        /*字符流的底层也是字节流，默认也是一个字节一个字节的读取的
        但是遇到中文就会一次读取多个，GBK一次读取两个字节，UTF-8一次读取三个字节
        */
        /*
        * read()方法的细节：
        *           1.默认也是一个字节一个字节进行读取的，如果遇到中文就会一次读取多个
        *           2.在读取之后，方法的底层还会进行解码并转成十进制。最终把这个十进制作为返回值
        *               这个十进制的数据也表示在字符集上的数字
        *   英文：0110 0001  read()方法读取，解码后转成十进制97
        *   中文：11100110 10110001 10001001   read()读取，解码后转成十进制27721
        * */
        int ch;
        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }
        //释放资源
        fr.close();
    }
}
