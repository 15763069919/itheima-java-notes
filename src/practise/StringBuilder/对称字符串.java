package practise.StringBuilder;

import java.util.Scanner;

public class 对称字符串 {
    public static void main(String[] args) {
        //1.键盘
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //2.反转
//        StringBuilder sb = new StringBuilder();
//        sb.append(str);
//        sb.reverse();
//        System.out.println(sb);

        //3.反转（链式编程）
        String string = new StringBuilder().append(str).reverse().toString();

        //4.比较
        if (str.equals(string)) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");

        }
    }
}
