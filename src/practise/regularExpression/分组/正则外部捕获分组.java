package practise.regularExpression.分组;

public class 正则外部捕获分组 {
    public static void main(String[] args) {
        /*
        练习 口吃替换
        需求：
        将字符串：我要学学编编编程程程程程程程
        替换为：我要学编程
         */
        String str = "我要学学编编编程程程程程程程";
        //(.)：重复内容的第一个字符
        //\\1+：重复内容多次出现
        //$1：把正则表达式第一组的内容拿出来再一次用，因为他是外部的，所以不用\\而用$
        String s = str.replaceAll("(.)\\1+", "$1");
        System.out.println(s);

    }
}
