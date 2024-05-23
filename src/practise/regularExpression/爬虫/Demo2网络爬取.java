package practise.regularExpression.爬虫;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2网络爬取 {
    public static void main(String[] args) throws IOException {
        //创建URL的对象
        URL ur1 = new URL("https://m.sengzan.com/jiaoyu/29104.html?ivk_sa=1025883i");
        //连接上这个网址
        URLConnection conn = ur1.openConnection();
        //创建一个对象去读取网络中的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        //获取正则表达式的对象
        String regex = "[1-9]\\d{17}";
        Pattern p = Pattern.compile(regex);
        //在读取的时候每次读取一整行
        while ((line = br.readLine()) != null) {
            Matcher macher = p.matcher(line);
            while (macher.find()) {
                System.out.println(line);
            }
        }
        br.close();
    }
}
