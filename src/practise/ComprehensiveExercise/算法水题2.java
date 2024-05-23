package practise.ComprehensiveExercise;

import java.util.Scanner;

public class 算法水题2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        String numStr = sc.nextLine();
        if (!numStr.matches("\\d+")) {
            System.out.println("输入有误");
        } else {
            System.out.println("输入成功");
            int num = Integer.parseInt(numStr);
            String binaryString = toBinaryString(num);
            System.out.println(binaryString);
        }

    }

    private static String toBinaryString(int num) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (num == 0) {
                break;
            }
            sb.append(num % 2);
            num /= 2;
        }
        return sb.reverse().toString();
    }
}
