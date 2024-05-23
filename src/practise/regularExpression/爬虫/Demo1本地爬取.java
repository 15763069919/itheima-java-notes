package practise.regularExpression.爬虫;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1本地爬取 {
    /*
    有如下文本，请按照要求爬取数据。
Java 自从95年问世以来，经历了很多版本，目前企业中用的最多的是java8和java11,因为这
两个是长期支持版本，下一个长期支持版本是laval7,相信在未来不久laval7也会逐新登上历史舞台
要求：找出里面所有的javaxx
     */
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11," +
                "因为这两个是长期支持版本，下一个长期支持版本是Java7,相信在未来不久Java7也会逐新登上历史舞台";

        //pattern：表示正则表达式
        //Matcher：文本匹配器，作用是按照正则表达式的规则去读取字符串，从头开始读取
        //在大串中去寻找符合匹配规则的子串

//        method1(str);



        //1.获取正则表达式的对象
        Pattern p = Pattern.compile("(?i)java\\d{0,2}");
        //2.获取文本匹配器的对象
        //拿着m去找str中符合p规则的子串
        Matcher m = p.matcher(str);
        //3。利用循环
        while(m.find()){
            String s = m.group();
            System.out.println(s);
        }

    }

    private static void method1(String str) {
        //获取正则表达式的对象
        Pattern p = Pattern.compile("(?i)java\\d{0,2}");
        //获取文本匹配器的对象
        //m：文本匹配器的对象
        //p：规则（正则表达式的对象）
        //str：大串
        //m要在str中去找符合p规则的小串
        Matcher m = p.matcher(str);

        //拿着文本匹配器从头开始读取，寻找是否有满足规则的子串
        //如果没有，返回false
        //如果有，返回true。在底层记录子串的起始索引和结束索引+1
        //eg:记录开头的java，则会记录0,4
        boolean b = m.find();

        //方法底层会根据find方法记录的字符串索引进行截取
        //subString(起始索引，结束索引); 包头不包尾
        //(0,4)但是不包含4索引
        //会把截取完的小串进行返回
        String s1 = m.group();
        System.out.println(s1);

        //第二次调用find方法的时候，会继续读取后面的内容
        //读取到第二个满足的子串，方法会继续返回true
        //并把第二个子串的起始索引和结束索引+1，进行记录
        b = m.find();

        //第二次调用group方法的时候，会根据find方法记录的索引进行截取
        String s2 = m.group();
        System.out.println(s2);
    }
}
