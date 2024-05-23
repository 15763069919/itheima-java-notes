package util;

public class getTimeUtil {
    private getTimeUtil(){}
    public static void getSystemTime() {
        //纳秒ns：
        long startTime = System.nanoTime(); //获取开始时间
        // 要测的程序或方法
        long endTime = System.nanoTime(); //获取结束时间
        System.out.println("程序运行时间： " + (endTime - startTime) + "ns");
    }
}
