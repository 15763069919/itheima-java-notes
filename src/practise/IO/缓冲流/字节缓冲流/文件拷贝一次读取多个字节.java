package practise.IO.缓冲流.字节缓冲流;

import java.io.*;

public class 文件拷贝一次读取多个字节 {
    public static void main(String[] args) throws IOException {
        //1. 创建缓冲流的对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("lib/txt/a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lib/directory/a.txt"));
        //2.拷贝
        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        //3.释放资源
        bos.close();
        bis.close();
    }
}
