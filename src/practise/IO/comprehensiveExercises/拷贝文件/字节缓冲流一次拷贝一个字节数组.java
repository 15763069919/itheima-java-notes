package practise.IO.comprehensiveExercises.拷贝文件;

import java.io.*;

public class 字节缓冲流一次拷贝一个字节数组 {
    public static void main(String[] args) throws IOException {
        //创建字节缓冲流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("lib/txt/a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lib/dest/a.txt"));
        //拷贝
        int len;
        byte[] bytes = new byte[1024*1024*5];
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        //释放资源
        bos.close();
        bis.close();
    }
}
