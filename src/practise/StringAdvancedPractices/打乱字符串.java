package practise.StringAdvancedPractices;
/*
��������һ���ַ������������������
 */

import java.util.Random;
import java.util.Scanner;
public class �����ַ��� {
    public static void main(String[] args) {
        //����¼��
        System.out.println("�������ַ�����");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //��������
        System.out.println(shuffleStr(str));
    }

    public static String shuffleStr(String str){
        Random r = new Random();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return new String(arr);
    }


}
