package practise.basePractices;

import java.util.Scanner;

public class af���ּ��� {
    //�ж���������λ��
    public static int judgeBit(int number) {
        int count = 0;
        while (true) {
            if (number / 10 == 0) {
                count++;
                break;
            }
            number /= 10;
            count++;
        }
        return count;
    }

    //��ӡ��������
    public static void printArray(int arr[]) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //main����
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ҫ���ܵ���������:");
        int number = sc.nextInt();
        int numberDigit = judgeBit(number);//��ȡ����λ��
        int arr[] = new int[numberDigit];//����sumλ
        for (int i = numberDigit - 1; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;
        }
        printArray(arr); //��ӡ��������
        //ÿλ����5
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }
        printArray(arr); //��ӡ��������
        //��10����
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10;
        }
        printArray(arr); //��ӡ��������
        //��ת
        int btemp = 0;
        int ftemp = arr.length - 1;
        while (btemp < ftemp) {
            int temp = arr[btemp];
            arr[btemp] = arr[ftemp];
            arr[ftemp] = temp;
            ftemp--;
            btemp++;
        }
        printArray(arr); //��ӡ��������
    }
}
