package practise.regularExpression.����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2������ȡ {
    public static void main(String[] args) throws IOException {
        //����URL�Ķ���
        URL ur1 = new URL("https://m.sengzan.com/jiaoyu/29104.html?ivk_sa=1025883i");
        //�����������ַ
        URLConnection conn = ur1.openConnection();
        //����һ������ȥ��ȡ�����е�����
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        //��ȡ������ʽ�Ķ���
        String regex = "[1-9]\\d{17}";
        Pattern p = Pattern.compile(regex);
        //�ڶ�ȡ��ʱ��ÿ�ζ�ȡһ����
        while ((line = br.readLine()) != null) {
            Matcher macher = p.matcher(line);
            while (macher.find()) {
                System.out.println(line);
            }
        }
        br.close();
    }
}
