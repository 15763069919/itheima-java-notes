package practise.time.JDK7.Date;

import java.util.Date;

public class 时间计算 {
    public static void main(String[] args) {
       /*
       public date() 创建date对象，表示当前时间
    public date(long date) 创建date对象，表示指定时间
    public void settime(long time) 设置/修改毫秒值
    public long gettime() 获取时间对象的毫秒值
        */
        Date d1 = new Date();
        System.out.println(d1);//打印的是系统当前时间
        System.out.println(d1.getTime());//打印的是系统当前时间的毫秒

        System.out.println("=====================");

        Date d2 = new Date(0L);//创建指定时间的对象，单位是毫秒
        System.out.println(d2);//打印的是1970.1.1 周四8:00
        System.out.println(d2.getTime());//打印的是1970.1.1 周四8:00距指定时间的毫秒值
        d2.setTime(1000L);//设置毫秒值
        System.out.println(d2);//打印修改后毫秒值的时间（在1970.1.1 周四8:00上叠加）
        System.out.println(d2.getTime());//打印距离1970.1.1 周四8:00的时间的毫秒



    }
}
