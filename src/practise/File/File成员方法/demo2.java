package practise.File.File成员方法;

import java.io.File;
import java.text.SimpleDateFormat;

public class demo2 {
    public static void main(String[] args) {
        //创建FIle对象
        File f1 = new File("lib/txt/a.txt");
        File f2 = new File("lib/b");

        //length()  这个成员方法只能获取文件的大小，单位是字节
        //获取文件大小
        System.out.println(f1.length());    //11
        //获取文件夹大小
        System.out.println(f2.length());    //0

        System.out.println("============================");

        //getAbsolutePath() 获取文件的绝对路径
        System.out.println(f1.getAbsolutePath());   //D:\Work\JAVA\IdeaCode\itheima\itheima\lib\txt\a.txt

        //getPath()    获取在定义文件对象时的路径
        System.out.println(f1.getPath());   //lib\txt\a.txt

        //getName()
        System.out.println(f1.getName());   //a.txt

        //lastModified()    返回文件最后修改时间的毫秒值
        System.out.println(f1.lastModified());  //1714136458596
        //将毫秒值转换为日期
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(simpleDateFormat.format(1714136458596L));  //2024年04月26日 21:00:58
    }
}
