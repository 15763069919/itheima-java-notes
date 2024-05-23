package practise.IO.comprehensiveExercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 文件加密 {
    public static void main(String[] args) throws IOException {
        /*
           ^ 异或 -- 相同为false，不同为true
           true ^ true = false
           false ^ false = false
           false ^ true  = true


      100 ^ 10 = 110:
            转换成二进制：
                100 ->  64 + 32 + 4 ->  1 1 0 0 1 0 0
                10  ->  8 + 2       ->  0 0 0 1 0 1 0
            异或运算：
                    1 1 0 0 1 0 0
                  ^ 0 0 0 1 0 1 0
                  —————————————————
                    1 1 0 1 1 1 0   -> 64 + 32 + 8 + 4 + 2 = 110

      110 ^ 10 = 100

      总结：   1.  A ^ B ^ B = A   一个数异或本身等于0
              2.  A ^ 0 = A       一个数异或0等于本身

       * */

        //1.创建对象关联原始文件
        FileInputStream fis = new FileInputStream("lib/txt/a.txt");
        //2.创建对象关联加密文件
        FileOutputStream fos = new FileOutputStream("lib/txt/ency.txt");
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
