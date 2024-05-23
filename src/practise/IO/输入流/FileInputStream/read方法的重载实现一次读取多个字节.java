package practise.IO.输入流.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class read方法的重载实现一次读取多个字节 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("lib/txt/a.txt");
        byte[] bytes = new byte[2];
        //返回值：本次读取了多少个数据
        int len1 = fis.read(bytes);
        System.out.println(len1);
        String str1 = new String(bytes,0,len1);
        System.out.println(str1);

        int len2 = fis.read(bytes);
        System.out.println(len2);
        String str2 = new String(bytes,0,len2);
        System.out.println(str2);

        fis.close();
        
    }
}
