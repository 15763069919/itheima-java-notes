package practise.File.File构造方法;

import java.io.File;

public class demo1 {
    public static void main(String[] args) {
        //1.根据文件路径创建文件对象
        String str = "lib/txt/a.txt";
        //将字符串转为File的对象
        File f1 = new File(str);
        System.out.println(f1);
        //使用File里面的方法


        //2. 根据父路径名字符串和子路径名字符串创建文件对象
        //父路径：lib/txt/
        //子路径：a.txt
        String parent = "lib/txt/";
        String child = "a.txt";
        File f2 = new File(parent,child);
        System.out.println(f2);

        //3.把一个File表示的路径和String表示的路径进行拼接
        File parent2 = new File("lib/txt/");
        String child2 = "a.txt";
        File f3 = new File(parent2,child2);
        System.out.println(f3);
    }
}
