package practise.basePractices;

import java.util.Random;
import java.util.Scanner;

//bug: 1. һ���Դ�ӡ 2.���������1-5
public class ah����� {
    //��ȡ�����
    public static void getRandom(int arr[]) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomNumber = r.nextInt(6);//��������ܵ���0,��Ϊ��ʼ��Ϊ0
            //�ж�������Ƿ���ͬ
            //����������ͬ
            while (true) {
                boolean temp = containsIsSame(arr, randomNumber);
                if (temp)
                    randomNumber = r.nextInt(6);
                else if (temp == false)
                    break;
            }
            //�������������
            arr[i] = randomNumber;
        }
    }

    //����Ƿ���ͬ,true��ͬ,false����ͬ
    public static boolean containsIsSame(int arr[], int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number)
                return true;
        }
        return false;
    }

    //��ӡ����
    public static void printArray(int arr[]) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //main����
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //���ý���
        int arr[] = {2, 588, 888, 1000, 10000};
        //���ó齱����
        int flag[] = new int[arr.length];
        //��ȡ��ΧΪ1-5�Ĳ��ظ��������
        getRandom(flag);
//        printArray(flag);
        //�����-1
        for (int i = 0; i < flag.length; i++) {
            flag[i] -= 1;
        }
//        printArray(flag);

        //һ�δ�ӡ��Ӧ����
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[flag[i]]);
//        }

        //����һ�λس���ӡһ��
        int i=0;
        while (true) {
            if (i ==arr.length) {
                System.out.println("\n\n\t������ȫ������!");
                break;
            }
            System.out.println("\n����س��Գ齱:");
            String input = sc.nextLine();
            System.out.println("(��"+(i+1)+"/"+arr .length+"��)");
            System.out.println("�����н�������Ϊ: " + flag[i]);
            System.out.println("���Ľ���Ϊ: " + arr[flag[i]]);

            i++;
        }
    }
}
