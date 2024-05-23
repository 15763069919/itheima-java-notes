package practise.ComprehensiveExercise;

public class 算法水题 {
    public static void main(String[] args) {
        /*
        自己实现parseInt方法，将字符串转换为整数
        要求：字符串只能是数字不能是其他字符
        最少一位，最多是10位
        0不能开头
         */

        String str1 = "10086";
        String str2 = "10086a";

        String regex = "[1-9]\\d{0,9}";
        if (!str2.matches(regex)) {
            System.out.println("输入有误");
        } else {
            System.out.println("输入成功");
            int number = 0;
            for (int i = 0; i < str2.length(); i++) {
                char c = str2.charAt(i);
                int num = c - '0';
                number = number * 10 + num;
            }
        System.out.println(number);
        }

    }


}
