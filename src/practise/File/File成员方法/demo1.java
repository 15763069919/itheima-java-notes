package practise.File.File��Ա����;

import java.io.File;

public class demo1 {
    public static void main(String[] args) {
        //1.��һ���ļ���·�������ж�
        File f1= new File("lib/txt/a.txt");
        System.out.println(f1.isDirectory());   //false
        System.out.println(f1.isFile());    //true
        System.out.println(f1.exists());    //true

        System.out.println("=====================");

        //2.��һ���ļ��е�·�������ж�
        File f2= new File("lib/b");
        System.out.println(f2.isDirectory());   //true
        System.out.println(f2.isFile());    //false
        System.out.println(f2.exists());    //true

        System.out.println("=====================");

        //3.��һ�������ڵ�·�������ж�
        File f3= new File("lib/bbbbbbbbb");
        System.out.println(f3.isDirectory());   //false
        System.out.println(f3.isFile());    //false
        System.out.println(f3.exists());    //false


    }
}
