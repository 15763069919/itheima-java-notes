package practise.StringPractices;

import java.util.Scanner;

public class ͳ���ַ����� {
    public static void main(String[] args) {
        //1.����¼��
        Scanner sc = new Scanner(System.in);
        System.out.println("�����ַ�����");
        String str = sc.next();

        //2.ͳ�� -- ������˼��
        //��������������
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            //����ÿһ���ַ�
            char c = str.charAt(i);
//            System.out.println(c);
            //����
            if (c >= 'a' && c <= 'z')
                smallCount++;
            else if (c >= 'A' && c <= 'Z')
                bigCount++;
            else if (c >= '0' && c <= '9') {
                numberCount++;
            }


        }
        //3.�����ӡ
        System.out.println("Сд��ĸ�У�" + smallCount + "��");
        System.out.println("��д��ĸ�У�" + bigCount + "��");
        System.out.println("�����У�" + numberCount + "��");
    }
}
