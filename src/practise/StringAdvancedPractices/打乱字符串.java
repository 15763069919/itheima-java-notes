package practise.StringAdvancedPractices;
/*
键盘输入一个字符串，打乱里面的内容
 */

import java.util.Random;
import java.util.Scanner;
public class 打乱字符串 {
    public static void main(String[] args) {
        //键盘录入
        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //打乱内容
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
