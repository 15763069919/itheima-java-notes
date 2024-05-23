package practise.IO.输入流.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class 循环读取 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileInputStream fis = new FileInputStream("lib/txt/a.txt");
        /*//循环读取
        int b;//记录读取的数据
        while((b = fis.read())!=-1){ //给b赋值，并判断b不为-1，即保证没有读取到结尾
            System.out.print((char)b);
        }
        //3.释放资源
        fis.close();*/

        //若不使用变量b
        //写一次fis.read()移动一次指针，一个循环移动了两次
        while((fis.read())!=-1){ //给b赋值，并判断b不为-1，即保证没有读取到结尾
            System.out.print((char)fis.read());
        }
        //3.释放资源
        fis.close();
    }
}
