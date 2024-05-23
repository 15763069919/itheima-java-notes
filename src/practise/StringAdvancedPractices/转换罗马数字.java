package practise.StringAdvancedPractices;
/*
 * 键盘录入一个字符串，要求1：长度<=9 要求2：只能是数字，将内容转变成罗马数字，0转换成长度为0的字符串
*/

import java.util.Scanner;

public class 转换罗马数字 {
    public static void main(String[] args) {
        String str;
        while (true) {
            //获取数字字符串
            System.out.println("请输入字符串：");
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            //判断字符串是否合法
            if (checkStr(str)) break;
            else {
                System.out.println("输入不合法！");
                continue;
            }
        }

        //【法一】自写：传入数字字符串
        changeLuoMa(str);
        System.out.println(changeLuoMa(str));

        //【法二】阿玮
        for (int i = 0; i < str.length(); i++) {
            //charAt得到的数只是字符‘数’，并非数字，需要减去字符‘0’得到数字
            System.out.print(changeLuoMa(str.charAt(i)-'0'));
        }
        System.out.println();

        //【法三】阿伟
        for (int i = 0; i < str.length(); i++) {
            System.out.print(changeLuoMa(str.charAt(i)));
        }
        System.out.println();

        //【法四】自写
        System.out.println(changeLuoMa2(str));
    }

    public static boolean checkStr(String str) {
        //长度小于9
        if (str.length() > 9) return false;
        //全部为数字
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > '9' || str.charAt(i) < '0') return false;
        }
        return true;
    }

    //【法一】自写
    //传入一个字符串，通过索引和字符串数组来存入StringBuilder，最后toString返回字符串
    public static String changeLuoMa(String str) {
        String[] arr = {"","Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ","Ⅸ"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(arr[str.charAt(i) - '0']);
        }
        return sb.toString();
    }

    //【法二】阿伟
    //直接建立字符串数组与索引之间的练习
    public static String changeLuoMa(int number){
        String[] arr = {"","Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ","Ⅸ"};
        return arr[number];
    }

    //【法三】阿伟
    //通过传入字符数字直接转换成罗马数字
    public static String changeLuoMa(char number){
        String str = switch (number){
            case '0' -> str = "";
            case '1' -> str = "Ⅰ";
            case '2' -> str = "Ⅱ";
            case '3' -> str = "Ⅲ";
            case '4' -> str = "Ⅳ";
            case '5' -> str = "Ⅴ";
            case '6' -> str = "Ⅵ";
            case '7' -> str = "Ⅶ";
            case '8' -> str = "Ⅷ";
            case '9' -> str = "Ⅸ";
            default -> str = "";
        };
        return str;
    }

    //【法四】自写
    //通过String的replace方法替换为罗马数字
    public static String changeLuoMa2(String str){
        String[] arr = {"","Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ","Ⅸ"};
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.replace(str,arr[str.charAt(i)-'0']);
        }
        return result;
    }

}

