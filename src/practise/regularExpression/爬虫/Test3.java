package practise.regularExpression.爬虫;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
    /*
    需求：把下面文本中的电话，邮箱，手机号，热线都爬取出来。
    来黑马程序员学习java,
    电话：18512516758,18512508907
    或者联系邮箱：boniu@itcast.cn
    座机电话：01036517895,010-98951256
    邮箱：bozai@itcast.cn
    热线电话：400-618-9090,400-618-4000,4006184000,40061890909090
     */
    public static void main(String[] args) {
        String str = "需求：把下面文本中的电话，邮箱，手机号，热线都爬取出来。\n" +
                "来黑马程序员学习java,\n" +
                "电话：18512516758,18512508907\n" +
                "或者联系邮箱：boniu@itcast.cn\n" +
                "座机电话：01036517895,010-98951256\n" +
                "邮箱：bozai@itcast.cn\n" +
                "热线电话：400-618-9090,400-618-4000,4006184000,4006189090";

        String redex = "((?:(?:\\+|00)86)?1[3-9]\\d{9})"
                + "|(\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-z]{2,3}){1,2})"
                +"|(0\\d{2,3}-?[1-9]\\d{4,9})"
                +"|(400-?\\d{3}-?\\d{4})";
        //创建正则表达式对象
        //创建文本匹配器
        Pattern p = Pattern.compile(redex);
        Matcher m = p.matcher(str);
        while(m.find()){
            String s = m.group();
            System.out.println(s);
        }


    }
}
