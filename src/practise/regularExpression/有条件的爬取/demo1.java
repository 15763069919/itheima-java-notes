package practise.regularExpression.有条件的爬取;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo1 {
    /*
    有如下文本，请按照要求爬取数据。
Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11,因为这两个是长
期支持版本，下一个长期支持版本是Java17.相信在未来不久Java17也会逐渐登上历史舞台
需求1:爬取版本号为8,11,17的Java文本，但是只要Java不显示版本号。
需求2:爬取版本号为8,11,17的Java文本。正确爬取结果为：Java8 Java11 Java17 Java17
需求3:爬取除了版本号为8,11,17的Java文本，
     */

    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11,因为这两个是长\n" +
                "期支持版本，下一个长期支持版本是Java17.相信在未来不久Java17也会逐渐登上历史舞台";

        //需求1:爬取版本号为8,11,17的Java文本，但是只要Java不显示版本号。
        //?可以理解为前面的数据Java
        //=表示在Java后面要跟随的数据，但是在获取的时候，只获取前半部分
        String redex1 = "((?i)java)(?=8|11|17)";
        Pattern p1 = Pattern.compile(redex1);
        Matcher m1 = p1.matcher(str);
        while(m1.find()){
            String s1 = m1.group();
            System.out.println(s1);
        }

        System.out.println("=============================");

//        需求2:爬取版本号为8,11,17的Java文本。正确爬取结果为：Java8 Java11 Java17 Java17
        String redex2 = "((?i)java)(8|11|17)";
        Pattern p2 = Pattern.compile(redex2);
        Matcher m2 = p2.matcher(str);
        while(m2.find()){
            String s2 = m2.group();
            System.out.println(s2);
        }

        System.out.println("=============================");

        String redex3 = "((?i)java)(?:8|11|17)";
        Pattern p3 = Pattern.compile(redex3);
        Matcher m3 = p3.matcher(str);
        while(m3.find()){
            String s3= m3.group();
            System.out.println(s3);
        }

        System.out.println("=============================");

//        需求3:爬取除了版本号为8,11,17的Java文本，

        String redex4 = "((?i)java)(?!8|11|17)";
        Pattern p4 = Pattern.compile(redex4);
        Matcher m4 = p4.matcher(str);
        while(m4.find()){
            String s4= m4.group();
            System.out.println(s4);
        }

    }
}
