package practise.time.JDK8.Instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo1 {
    public static void main(String[] args) {
        /*
        static instant now(); 获取当前时间的instant对象（标准时间）
        static instant ofXxx(Long epochMilli); 根据（秒/毫秒/纳秒）获取instant对象
        zonedDatetime atZone(ZoneId zone); 指定时区
        boolean isXxx(Instant otherInstant); 判断系列的方法
        instant minusXxx(Long millisToSubtract); 减少时间系列的方法
        instant plusXxx(Long millisToSubtract); 增加时间系列的方法
         */

        //1.static instant now(); 获取当前时间的Instant对象（标准时间）
        Instant now = Instant.now();
        System.out.println(now);    //2024-04-07T01:58:25.591495500Z

        //2. static instant ofXxx(long epochMilli);根据（秒、毫秒、纳秒）获取Instant对象
        //0L获取时间原点以后的0毫秒的时间 == 时间原点
        Instant instant1 = Instant.ofEpochMilli(0L);    //Milli = millisecond 毫秒
        System.out.println(instant1);   //1970-01-01T00:00:00Z

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);   //1970-01-01T00:00:01Z

        Instant instant = Instant.ofEpochSecond(1L, 1000000000L);
        //epochSecond：毫秒        nanoAdjustment：纳秒
        System.out.println(instant);    //1970-01-01T00:00:02Z

        //3.zonedDatetime atZone(ZoneId zone); 指定时区
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("America/Marigot"));
        System.out.println(zonedDateTime);  //2024-04-06T22:20:14.107989-04:00[America/Marigot]

        //4.boolean isXxx(Instant otherInstant); 判断系列的方法
        Instant instant3 = Instant.ofEpochMilli(0L);
        Instant instant4 = Instant.ofEpochMilli(1000L);

        boolean after = instant3.isAfter(instant4);
        System.out.println(after);  //false

        boolean before = instant3.isBefore(instant4);
        System.out.println(before);  //true


        //5.instant minusXxx(Long millisToSubtract); 减少时间系列的方法
        Instant instant5 = Instant.ofEpochMilli(3000L);
        System.out.println(instant5);   //1970-01-01T00:00:03Z
        Instant instant6 = instant5.minusMillis(3000L);
        System.out.println(instant6);   //1970-01-01T00:00:00Z

        Instant instant7 = instant6.minusSeconds(1970L * 365 * 24 * 60 * 60 * 1000);
        System.out.println(instant7);   //-1966723-12-19T00:00:00Z
        //6.instant plusXxx(Long millisToSubtract); 增加时间系列的方法

    }
}
