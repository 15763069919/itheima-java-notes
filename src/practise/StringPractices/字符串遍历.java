package practise.StringPractices;

import java.util.Scanner;

public class 字符串遍历 {
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //2.遍历
        for (int i = 0; i < str.length(); i++) {
            //i一次表示字符串每一个索引
            System.out.println(str.charAt(i));//charAt字符串索引->字符
        }
    }
}
