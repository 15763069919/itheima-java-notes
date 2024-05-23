package practise.File.File成员方法;

import java.io.File;

public class demo1 {
    public static void main(String[] args) {
        //1.对一个文件的路径进行判断
        File f1= new File("lib/txt/a.txt");
        System.out.println(f1.isDirectory());   //false
        System.out.println(f1.isFile());    //true
        System.out.println(f1.exists());    //true

        System.out.println("=====================");

        //2.对一个文件夹的路径进行判断
        File f2= new File("lib/b");
        System.out.println(f2.isDirectory());   //true
        System.out.println(f2.isFile());    //false
        System.out.println(f2.exists());    //true

        System.out.println("=====================");

        //3.对一个不存在的路径进行判断
        File f3= new File("lib/bbbbbbbbb");
        System.out.println(f3.isDirectory());   //false
        System.out.println(f3.isFile());    //false
        System.out.println(f3.exists());    //false


    }
}
