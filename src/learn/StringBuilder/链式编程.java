package learn.StringBuilder;

import java.util.Scanner;

public class 链式编程 {
    public static void main(String[] args) {
        int length = getString().substring(1).replace("A", "Q").length();
        System.out.println(length);

    }





    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        return str;

    }
}
