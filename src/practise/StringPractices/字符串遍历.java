package practise.StringPractices;

import java.util.Scanner;

public class �ַ������� {
    public static void main(String[] args) {
        //1.����¼��
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ���");
        String str = sc.next();
        //2.����
        for (int i = 0; i < str.length(); i++) {
            //iһ�α�ʾ�ַ���ÿһ������
            System.out.println(str.charAt(i));//charAt�ַ�������->�ַ�
        }
    }
}
