package practise.IO.comprehensiveExercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 文件解密 {
    public static void main(String[] args) throws IOException {
        /*
        * 和文件加密不同的是，只需要修改关联对象的文件路径即可
        * */
        //1.创建对象关联原始文件
        FileInputStream fis = new FileInputStream("lib/txt/ency.txt");
        //2.创建对象关联加密文件
        FileOutputStream fos = new FileOutputStream("lib/txt/a.txt");
        //3.加密文件
        int b;
        while((b = fis.read()) != -1){
            fos.write(b^2);
        }
        //4.释放资源
        fos.close();
        fis.close();
    }
}
