package practise.basePractices;

import java.util.Scanner;

public class ag数字解密 {
    public static int judgeBit(int number) {
        int count = 0;
        while (true) {
            if (number / 10 == 0) {
                count++;
                break;
            }
            count++;
            number /= 10;
        }
        return count;
    }

    public static void printArray(int arr[]) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要解密的密码:");
        int number = sc.nextInt();
        int numberDigit = judgeBit(number);
        //数字按位存入数组
        int arr[] = new int[numberDigit];
        for (int i = arr.length-1;i>=0;i--) {
            arr[i] = number % 10;
            number /= 10;
        }
        printArray(arr);
        //反转
        for(int i = 0,j = arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        printArray(arr);
        //由于加密是原数(0~4,5~9)先加5(5~9,10~14)再取余(5~9),5~9取余不变,10~14取余-10为0~4
        //则解密只需5~9不变,0~4 +10
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0&&arr[i]<=4)
                arr[i]+=10;
        }
        printArray(arr);
        //-5
        for (int i = 0; i < arr.length; i++) {
            arr[i] -=5;
        }
        printArray(arr);
    }
}
