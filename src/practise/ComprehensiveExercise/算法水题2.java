package practise.ComprehensiveExercise;

import java.util.Scanner;

public class �㷨ˮ��2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("���������֣�");
        String numStr = sc.nextLine();
        if (!numStr.matches("\\d+")) {
            System.out.println("��������");
        } else {
            System.out.println("����ɹ�");
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
