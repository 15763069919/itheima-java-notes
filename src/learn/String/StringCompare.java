package learn.String;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        //1. ���������ַ�������
        String s1 = new String("abc");
        String s2 ="abc";

        //2.==�Ƚ�
        //�����������ͣ��Ƚ���ֵ
        //�����������ͣ��Ƚϵ�ֵַ
//        System.out.println(s1==s2);//false

        //3.�Ƚ��ַ��������е������Ƿ����
        boolean result1 = s1.equals(s2);
//        System.out.println(result1);//true

        //4.�Ƚ��ַ����е������Ƿ���ȣ����Դ�Сд
        boolean result2 = s1.equalsIgnoreCase(s2);
//        System.out.println(result2);//true

        //5. ����¼��ʹ��븳ֵ���ַ�����==�Ƚ�
        Scanner sc = new Scanner(System.in);
        String s3 = sc.next();//new������
        System.out.println(s3==s1);
        System.out.println(s3==s2);
    }
}
