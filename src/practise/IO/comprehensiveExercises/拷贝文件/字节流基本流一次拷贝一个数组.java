package practise.IO.comprehensiveExercises.拷贝文件;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 字节流基本流一次拷贝一个数组 {
    public static void main(String[] args) throws IOException {
        //创建字节流对象
        FileInputStream fis = new FileInputStream("lib/txt/a.txt");
        FileOutputStream fos = new FileOutputStream("lib/dest/a.txt");
        int b;
        while((b = fis.read()) != -1){
            fos.write(b);
        }
        //释放资源
        fos.close();
        fis.close();
    }
}
