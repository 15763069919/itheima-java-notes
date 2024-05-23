package practise.File.File成员方法;

import java.io.File;

public class demo4 {
    public static void main(String[] args) {
        //listFiles()   获取文件夹下的所有内容
        File f1 = new File("lib");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
