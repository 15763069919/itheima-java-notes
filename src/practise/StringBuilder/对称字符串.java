package practise.StringBuilder;

import java.util.Scanner;

public class �Գ��ַ��� {
    public static void main(String[] args) {
        //1.����
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ���");
        String str = sc.next();

        //2.��ת
//        StringBuilder sb = new StringBuilder();
//        sb.append(str);
//        sb.reverse();
//        System.out.println(sb);

        //3.��ת����ʽ��̣�
        String string = new StringBuilder().append(str).reverse().toString();

        //4.�Ƚ�
        if (str.equals(string)) {
            System.out.println("�ǶԳ��ַ���");
        } else {
            System.out.println("���ǶԳ��ַ���");

        }
    }
}
