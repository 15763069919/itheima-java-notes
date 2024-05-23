package practise.StringAdvancedPractices;

public class 返回字符串中最后一个单词的长度 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        String str = new java.util.Scanner(System.in).nextLine();
        System.out.println("字符串中最后一个单词的长度为：" + tailWordLength(str));
    }

    public static int tailWordLength(String str) {
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ')
                count++;
            else
                break;
        }
        return count;


    }
}