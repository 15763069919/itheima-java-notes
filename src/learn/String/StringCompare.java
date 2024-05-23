package learn.String;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        //1. 创建两个字符串对象
        String s1 = new String("abc");
        String s2 ="abc";

        //2.==比较
        //基本数据类型：比较数值
        //引用数据类型：比较地址值
//        System.out.println(s1==s2);//false

        //3.比较字符串对象中的内容是否相等
        boolean result1 = s1.equals(s2);
//        System.out.println(result1);//true

        //4.比较字符串中的内容是否相等，忽略大小写
        boolean result2 = s1.equalsIgnoreCase(s2);
//        System.out.println(result2);//true

        //5. 键盘录入和代码赋值的字符串用==比较
        Scanner sc = new Scanner(System.in);
        String s3 = sc.next();//new出来的
        System.out.println(s3==s1);
        System.out.println(s3==s2);
    }
}
