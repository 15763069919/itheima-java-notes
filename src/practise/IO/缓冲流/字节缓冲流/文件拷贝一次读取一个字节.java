package practise.IO.缓冲流.字节缓冲流;

import java.io.*;

public class 文件拷贝一次读取一个字节 {
    public static void main(String[] args) throws IOException {
        //创建缓冲流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("lib/txt/a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lib/directory/a.txt"));
        //循环读取并写到目的地
        int b;
        while ((b = bis.read()) != -1){
            bos.write(b);
        }
        //释放资源
        bos.close();
        bis.close();



    }
}
