package practise.networkProgram.ComprehensivePractice.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
        //ʱ��
        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
        //��ʽ��
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String format = dtf.format(now);
        System.out.println(format);
    }
}
