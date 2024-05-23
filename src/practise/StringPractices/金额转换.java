package practise.StringPractices;

import java.util.Scanner;

public class 金额转换 {
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入金额");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("金额无效");
            }
        }

        //定义一个变量用来表示钱的大写
        String moneyStr = "";

        //2.得到money中每位数字,在转成中文
        while (true) {
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            moneyStr = capitalNumber + moneyStr;
//            System.out.println(capitalNumber);
            money /= 10;
//            System.out.println(ge);
            if (money == 0)
                break;
        }

        //3.在前面补零
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零"+ moneyStr;
        }

        //4.插入单位
        String result = "";
        String arr[] = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < moneyStr.length(); i++) {
            result += moneyStr.charAt(i) + arr[i];
        }
        System.out.println(result);
    }

    //1->壹
    public static String getCapitalNumber(int number) {
        String arr[] = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }


}
