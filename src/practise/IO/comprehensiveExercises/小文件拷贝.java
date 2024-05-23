package practise.IO.comprehensiveExercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 小文件拷贝 {
    public static void main(String[] args) throws IOException {
        //读
        FileInputStream fis = new FileInputStream("lib/txt/a.txt");
        //写
        FileOutputStream fos = new FileOutputStream("lib/directory/a.txt");
        //拷贝
//        long startTime = System.currentTimeMillis();
        int b;
        while ((b = fis.read()) != -1){
            fos.write(b);
        }
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime-startTime+"ms");
        //释放资源 -- 先开的后关闭
        fos.close();
        fis.close();
    }
}
