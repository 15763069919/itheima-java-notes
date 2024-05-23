package practise.ComprehensiveExercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class 算法水题3 {
    public static void main(String[] args) throws ParseException {
        //JDK7
        //获取生日毫秒
        //设置生日
        String birthday = "2005年3月11日";
        //解析
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date birthdayDate = sdf.parse(birthday);
        //获取毫秒值
        long birthdayDateTime = birthdayDate.getTime();
        //获取当前时间
        Date nowDate = new Date();
        long nowTime = nowDate.getTime();
        long time = nowTime - birthdayDateTime;
        System.out.println(time / 1000 / 60 / 60 / 24);


        //JDK8
        LocalDate birth = LocalDate.of(2005,3,11);
        LocalDate now = LocalDate.now();
        long between = ChronoUnit.DAYS.between(birth, now);

        System.out.println(between);
    }


}
