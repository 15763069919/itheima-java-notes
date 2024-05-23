package algorithm;

import java.util.Scanner;   //导包

public class AB获取个位 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数值:");
        int number = sc.nextInt();
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
    }

}
