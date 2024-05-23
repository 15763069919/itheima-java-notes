package practise.networkProgram.ComprehensivePractice.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
        //时间
        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
        //格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String format = dtf.format(now);
        System.out.println(format);
    }
}
