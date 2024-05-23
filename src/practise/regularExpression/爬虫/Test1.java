package practise.regularExpression.爬虫;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11," +
                "因为这两个是长期支持版本，下一个长期支持版本是Java7,相信在未来不久Java7也会逐新登上历史舞台";

        String regex = "(?i)java\\d{0,2}";
        //1.根据正则表达式，创建正则表达式对象
        Pattern p = Pattern.compile(regex);
        //2.根据大串，创建文本匹配器的对象
        Matcher m = p.matcher(str);

       /* //3.使用文本匹配器进行爬取（即底层记录开始索引和结束索引+1）
        Boolean b = m.find();
        //4.接收爬取的（经过根据记录的索引进行底层字符串的截取，并返回截取的字符串）字符串
        String s = m.group();
        //5.打印
        System.out.println(s);*/

        while(m.find()){
            String s = m.group();
            System.out.println(s);
        }
    }
}
