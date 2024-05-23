package practise.regularExpression.分组;

public class 正则内部捕获分组的练习 {
    public static void main(String[] args) {
//需求1:判断一个字符串的开始字符和结束字符是否一致？只考虑一个字符
//举例：a123a b456b 17891 &abc&
        String redex1 = "(.).+\\1";
        System.out.println("a123a".matches(redex1));
        System.out.println("b456b".matches(redex1));
        System.out.println("17891".matches(redex1));
        System.out.println("&abc&".matches(redex1));
        System.out.println("&abc".matches(redex1));

        System.out.println("====================================");

//需求2:判断一个字符串的开始部分和结束部分是否一致？可以有多个字符
//举例：abc123abc b456b 123789123 &!@abc&!@   abc123abd(false)
        String redex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(redex2));
        System.out.println("b456b".matches(redex2));
        System.out.println("123789123".matches(redex2));
        System.out.println("&!@abc&!@".matches(redex2));
        System.out.println("abc123abd".matches(redex2));

        System.out.println("====================================");

//需求3：判断一个字符串的开始部分和结束部分是否一致？开始部分内部每个字符也需要一致
//举例： aal23aaa bbb456bbbb 111789111 &&abc&&
        //* 出现0或多次，控制\\1出现的次数，而\\1指的是第一个字符，即与第一个字符一致
        //(.)：任意一个字母看为一组并固定
        //\\1：与第一组一致
        //*控制\\1出现的次数为0或无数次
        //\\2：指的是((.)\1*)
        String redex3 = "((.)\\1*).+\\2";
        System.out.println("aal23aaa".matches(redex3));//true
        System.out.println("bbb456bbbb".matches(redex3));//true
        System.out.println("111789111".matches(redex3));//true
        System.out.println("&&abc&&".matches(redex3));//true
        System.out.println("&&abc".matches(redex3));//false

    }
}
