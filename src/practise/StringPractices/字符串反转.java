package practise.StringPractices;

import java.util.Scanner;

public class �ַ�����ת {
    public static void main(String[] args) {
        //1.����¼��
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(stringReverse1(str));
        System.out.println(stringReverse2(str));
    }

    //��һ��
    //���������Ȼ��result += c
    public static String stringReverse1(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            result += c;
        }
        return result;
    }

    //������
    //���������Ȼ��result = c + result
    public static String stringReverse2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result = c + result;
        }
        return result;
    }

}
