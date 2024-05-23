package practise.IO.tryAndCatchAndFinally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws FileNotFoundException {
        //JDK 7 IO流中捕获异常的写法
        /*   注意：try()后面的小括号中写创建对象的代码，只有实现了AutoCloseable接口，才能小括号中创建对象
         *
         *      try(创建对象){
         *
         *      }catch(){
         *
         *      }
         *
         */
        try (FileInputStream fis1 = new FileInputStream("lib/txt/a.txt");
             FileOutputStream fos1 = new FileOutputStream("lib/directory/a.txt")) {
            int len1;
            byte[] bytes = new byte[1024 * 1024 * 5];
            //读取
            while ((len1 = fis1.read(bytes)) != -1) {
                fos1.write(bytes, 0, len1);//最后一次可能装不满

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //JDK 9 IO流中捕获异常的写法
        /*
         *      创建对象
         *      try(){
         *
         *      }catch(){
         *
         *      }
         */
        FileInputStream fis2 = new FileInputStream("lib/txt/a.txt");
        FileOutputStream fos2 = new FileOutputStream("lib/directory/a.txt");

        try (fis2;fos2){
            int len2;
            byte[] bytes = new byte[1024 * 1024 * 5];
            //读取
            while ((len2 = fis2.read(bytes)) != -1) {
                fos2.write(bytes, 0, len2);//最后一次可能装不满

            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
