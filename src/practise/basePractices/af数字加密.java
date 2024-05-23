package practise.basePractices;

import java.util.Scanner;

public class af数字加密 {
    //判断输入数字位数
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

    //打印数组内容
    public static void printArray(int arr[]) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //main方法
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要加密的数字密码:");
        int number = sc.nextInt();
        int numberDigit = judgeBit(number);//获取输入位数
        int arr[] = new int[numberDigit];//开辟sum位
        for (int i = numberDigit - 1; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;
        }
        printArray(arr); //打印数组内容
        //每位数加5
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }
        printArray(arr); //打印数组内容
        //对10求余
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10;
        }
        printArray(arr); //打印数组内容
        //反转
        int btemp = 0;
        int ftemp = arr.length - 1;
        while (btemp < ftemp) {
            int temp = arr[btemp];
            arr[btemp] = arr[ftemp];
            arr[ftemp] = temp;
            ftemp--;
            btemp++;
        }
        printArray(arr); //打印数组内容
    }
}
