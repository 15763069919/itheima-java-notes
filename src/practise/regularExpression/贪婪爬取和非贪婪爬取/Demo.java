package practise.regularExpression.贪婪爬取和非贪婪爬取;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    /*
    有如下文本，请按照要求爬取数据。
Java自从95年问世以来，abbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaa
经历了很多版本，目前企业中用的最多的是Java8和Java11,因为这两个是长期支持版本，下一个长期
支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台
需求1:按照ab+的方式爬取ab,b尽可能多获取
需求2:按照ab+的方式爬取ab,b尽可能少获取
     */
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，abbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaa\n" +
                "经历了很多版本，目前企业中用的最多的是Java8和Java11,因为这两个是长期支持版本，下一个长期\n" +
                "支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台";
        //        需求1:按照ab+的方式爬取ab,b尽可能多获取
        String redex1 = "ab+";
        Pattern p1 = Pattern.compile(redex1);
        Matcher m1 = p1.matcher(str);
        while(m1.find()){
            String s1 = m1.group();
            System.out.println(s1);
        }

        String redex2 = "ab+?";
        Pattern p2 = Pattern.compile(redex2);
        Matcher m2 = p2.matcher(str);
        while(m2.find()){
            String s2 = m2.group();
            System.out.println(s2);
        }





//        需求2:按照ab+的方式爬取ab,b尽可能少获取

    }
}
