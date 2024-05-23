package practise.StringPractices;

import java.util.Scanner;

public class 统计字符次数 {
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串：");
        String str = sc.next();

        //2.统计 -- 计数器思想
        //定义三个计数器
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            //遍历每一个字符
            char c = str.charAt(i);
//            System.out.println(c);
            //计数
            if (c >= 'a' && c <= 'z')
                smallCount++;
            else if (c >= 'A' && c <= 'Z')
                bigCount++;
            else if (c >= '0' && c <= '9') {
                numberCount++;
            }


        }
        //3.输出打印
        System.out.println("小写字母有：" + smallCount + "个");
        System.out.println("大写字母有：" + bigCount + "个");
        System.out.println("数字有：" + numberCount + "个");
    }
}
