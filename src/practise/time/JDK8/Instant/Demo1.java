package practise.time.JDK8.Instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo1 {
    public static void main(String[] args) {
        /*
        static instant now(); ��ȡ��ǰʱ���instant���󣨱�׼ʱ�䣩
        static instant ofXxx(Long epochMilli); ���ݣ���/����/���룩��ȡinstant����
        zonedDatetime atZone(ZoneId zone); ָ��ʱ��
        boolean isXxx(Instant otherInstant); �ж�ϵ�еķ���
        instant minusXxx(Long millisToSubtract); ����ʱ��ϵ�еķ���
        instant plusXxx(Long millisToSubtract); ����ʱ��ϵ�еķ���
         */

        //1.static instant now(); ��ȡ��ǰʱ���Instant���󣨱�׼ʱ�䣩
        Instant now = Instant.now();
        System.out.println(now);    //2024-04-07T01:58:25.591495500Z

        //2. static instant ofXxx(long epochMilli);���ݣ��롢���롢���룩��ȡInstant����
        //0L��ȡʱ��ԭ���Ժ��0�����ʱ�� == ʱ��ԭ��
        Instant instant1 = Instant.ofEpochMilli(0L);    //Milli = millisecond ����
        System.out.println(instant1);   //1970-01-01T00:00:00Z

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);   //1970-01-01T00:00:01Z

        Instant instant = Instant.ofEpochSecond(1L, 1000000000L);
        //epochSecond������        nanoAdjustment������
        System.out.println(instant);    //1970-01-01T00:00:02Z

        //3.zonedDatetime atZone(ZoneId zone); ָ��ʱ��
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("America/Marigot"));
        System.out.println(zonedDateTime);  //2024-04-06T22:20:14.107989-04:00[America/Marigot]

        //4.boolean isXxx(Instant otherInstant); �ж�ϵ�еķ���
        Instant instant3 = Instant.ofEpochMilli(0L);
        Instant instant4 = Instant.ofEpochMilli(1000L);

        boolean after = instant3.isAfter(instant4);
        System.out.println(after);  //false

        boolean before = instant3.isBefore(instant4);
        System.out.println(before);  //true


        //5.instant minusXxx(Long millisToSubtract); ����ʱ��ϵ�еķ���
        Instant instant5 = Instant.ofEpochMilli(3000L);
        System.out.println(instant5);   //1970-01-01T00:00:03Z
        Instant instant6 = instant5.minusMillis(3000L);
        System.out.println(instant6);   //1970-01-01T00:00:00Z

        Instant instant7 = instant6.minusSeconds(1970L * 365 * 24 * 60 * 60 * 1000);
        System.out.println(instant7);   //-1966723-12-19T00:00:00Z
        //6.instant plusXxx(Long millisToSubtract); ����ʱ��ϵ�еķ���

    }
}
