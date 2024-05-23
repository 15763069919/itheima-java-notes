package practise.File;

import java.io.File;
import java.io.IOException;

public class 创建文件夹和此文件夹下的文件 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("aaa");
        System.out.println(f1.mkdirs());
        File f2 = new File(f1,"a.txt");
        System.out.println(f2.createNewFile());
    }
}
