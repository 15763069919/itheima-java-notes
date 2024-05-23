package practise.IO.comprehensiveExercises.拷贝文件;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 字节流基本数据流一次读写一个字节数组 {
    public static void main(String[] args) throws IOException {
        //创建字节流对象
        FileInputStream fis = new FileInputStream("lib/txt/a.txt");
        FileOutputStream fos = new FileOutputStream("lib/dest/a.txt");
        //拷贝
        int len;
        byte[] bytes = new byte[1024*1024*5];
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        //释放资源
        fos.close();
        fis.close();
    }
}
