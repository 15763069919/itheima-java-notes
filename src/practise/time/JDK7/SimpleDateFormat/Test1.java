package practise.time.JDK7.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        String str = "2000-11-11";
        //解析
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(str);
        System.out.println(date);
        //格式化
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String string = sdf2.format(date);
        System.out.println(string);

    }
}
