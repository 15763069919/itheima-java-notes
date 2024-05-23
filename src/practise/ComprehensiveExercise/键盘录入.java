package practise.ComprehensiveExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class 键盘录入 {
    /*
    键盘录入1~100之间的整数，并添加到集合，直到集合所有数据和超过200为止
     */
    public static void main(String[] args) {
//        extracted();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            System.out.println("请输入一个整数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);

            if(num<1||num>100){
                System.out.println("当前数字不在1~100范围中");
                continue;
            }else {
                //触发了自动装箱，因为集合不能存基本数据类型
                list.add(num);
            }
            //统计数据和
            int sum = getSum(list);
            if(sum>200){
                System.out.println("集合元素和大于200，存储已停止");
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            //自动拆箱：String  -> int
            sum += list.get(i);
        }
        return sum;
    }

    private static void extracted() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String num = sc.nextLine();
            sum += Integer.parseInt(num);

            list.add(num);

            if (sum == 200) {
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
