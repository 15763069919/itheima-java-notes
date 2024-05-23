package practise.time.JDK7.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 秒杀活动 {
    private static Date startDate;

    public static void main(String[] args) throws ParseException {
        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";
        String orderStr1 = "2023年11月11日 0:01:00";
        String orderStr2 = "2023年11月11日 0:11:0";

        //解析
        //创建SimpleDateFormat对象并设置格式
        SimpleDateFormat startSdf = new SimpleDateFormat("yyyy年MM月dd日 H:m:s");
        SimpleDateFormat endSdf = new SimpleDateFormat("yyyy年MM月dd日 H:mm:s");
        SimpleDateFormat order1Sdf = new SimpleDateFormat("yyyy年MM月dd日 H:mm:ss");
        SimpleDateFormat order2Sdf = new SimpleDateFormat("yyyy年MM月dd日 H:mm:s");
        //解析处Date对象并接收
        Date startDate = startSdf.parse(startStr);
        Date endDate = endSdf.parse(endStr);
        Date order1Date = endSdf.parse(orderStr1);
        Date order2Date = endSdf.parse(orderStr2);

        //得到毫秒值
        long startTime = startDate.getTime();
//        System.out.println(startTime);
        long endTime = endDate.getTime();
//        System.out.println(endTime);
        long order1Time = order1Date.getTime();
//        System.out.println(order1Time);
        long order2Time = order2Date.getTime();
//        System.out.println(order2Time);

        //比较
        if(order1Time > startTime && order1Time < endTime){
            System.out.println("参与成功");
        }else {
            System.out.println("参与失败");
        }
        if(order2Time > startTime && order2Time < endTime){
            System.out.println("参与成功");
        }else {
            System.out.println("参与失败");
        }

    }
}
