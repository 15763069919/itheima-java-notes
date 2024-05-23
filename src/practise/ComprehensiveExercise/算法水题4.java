package practise.ComprehensiveExercise;

import java.time.LocalDate;
import java.util.Calendar;

public class 算法水题4 {
    public static void main(String[] args) {
        /*判断任意的一个年份是闰年还是平年
        要求：用jdk7和jdk8两种方式判断
        提示：
              二月有29天是闰年
              一年有366天是闰年*/

        //JDK7
        //键盘录入
//        System.out.println("请输入一个年份：");
//        Scanner sc = new Scanner(System.in);
//        int year1 = Integer.parseInt(sc.nextLine());
        int year1 = 2000;

        //法一：2001.3.1往前减去一天，看看是28号还是29号
        //
        //创建日历对象，默认当前时间
        Calendar instance1 = Calendar.getInstance();
        //修改时间
        instance1.set(year1,Calendar.MARCH,1);
        //day-1
        instance1.add(Calendar.DAY_OF_MONTH,-1);
        int day1 = instance1.get(Calendar.DAY_OF_MONTH);
        System.out.println(day1);
        if(day1 == 29){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }

        //法二：2001.1.1往前减去一天，计算距离2000.1.1共有多少天
        //
        Calendar instance2 = Calendar.getInstance();
        instance2.set(2001, Calendar.JANUARY,1);
        instance2.add(Calendar.DAY_OF_MONTH,-1);
        int day2 = instance2.get(Calendar.DAY_OF_YEAR);
        System.out.println(day2);
        if(day2 == 366){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }


        System.out.println("===============================");

        //JDK8
        //
        //法一
        LocalDate localDate = LocalDate.of(2000, 3, 1);
        LocalDate localDate1 = localDate.minusDays(1);
        System.out.println(localDate1);
        if(localDate1.getDayOfMonth() == 29){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }

        //法二
        LocalDate localDate2 = LocalDate.of(2001, 1, 1);
        LocalDate localDate3 = localDate2.minusDays(1);
        if(localDate3.getDayOfYear() == 366){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }

        //法三
        LocalDate localDate4 = LocalDate.of(2000, 1, 1);
        boolean leapYear = localDate4.isLeapYear();
        System.out.println(leapYear);
    }
}
