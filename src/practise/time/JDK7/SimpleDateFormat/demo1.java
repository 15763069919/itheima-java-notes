package practise.time.JDK7.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo1 {
    public static void main(String[] args) throws ParseException {
//        extracted();

        String str = "2023-11-11 11:11:11";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = sdf1.parse(str);
        System.out.println(d1);

    }

    private static void extracted() {
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d = new Date(0L);
        System.out.println(d);//Thu Jan 01 08:00:00 CST 1970
        System.out.println(sdf1.format(d));//1970/1/1 上午8:00

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        Date d2 = new Date();
        System.out.println(sdf2.format(d2));
    }

}
