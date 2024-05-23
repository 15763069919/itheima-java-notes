package practise.IO.comprehensiveExercises.拷贝文件;

import java.io.*;

public class 字节缓冲流一次读取一个数据 {
    public static void main(String[] args) throws IOException {
        //创建字节缓冲流的对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("lib/txt/a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lib/dest/a.txt"));
        //拷贝
        int b;
        while((b = bis.read()) != -1){
            bos.write(b);
        }
        //释放资源
        bos.close();
        bis.close();
    }
}
