package algorithm;

import java.util.Scanner;   //����

public class AB��ȡ��λ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("������һ����λ��ֵ:");
        int number = sc.nextInt();
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
    }

}
