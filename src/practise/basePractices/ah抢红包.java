package practise.basePractices;

import java.util.Random;
import java.util.Scanner;

//bug: 1. 一次性打印 2.随机数成了1-5
public class ah抢红包 {
    //获取随机数
    public static void getRandom(int arr[]) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomNumber = r.nextInt(6);//随机数不能等于0,因为初始化为0
            //判断随机数是否相同
            //如果随机数相同
            while (true) {
                boolean temp = containsIsSame(arr, randomNumber);
                if (temp)
                    randomNumber = r.nextInt(6);
                else if (temp == false)
                    break;
            }
            //随机数存入数组
            arr[i] = randomNumber;
        }
    }

    //检测是否相同,true相同,false不相同
    public static boolean containsIsSame(int arr[], int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number)
                return true;
        }
        return false;
    }

    //打印数组
    public static void printArray(int arr[]) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //main方法
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //设置奖池
        int arr[] = {2, 588, 888, 1000, 10000};
        //设置抽奖号码
        int flag[] = new int[arr.length];
        //获取范围为1-5的不重复的随机数
        getRandom(flag);
//        printArray(flag);
        //随机数-1
        for (int i = 0; i < flag.length; i++) {
            flag[i] -= 1;
        }
//        printArray(flag);

        //一次打印对应奖金
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[flag[i]]);
//        }

        //输入一次回车打印一次
        int i=0;
        while (true) {
            if (i ==arr.length) {
                System.out.println("\n\n\t奖池已全部抽完!");
                break;
            }
            System.out.println("\n输入回车以抽奖:");
            String input = sc.nextLine();
            System.out.println("(第"+(i+1)+"/"+arr .length+"次)");
            System.out.println("您的中奖励号码为: " + flag[i]);
            System.out.println("您的奖金为: " + arr[flag[i]]);

            i++;
        }
    }
}
