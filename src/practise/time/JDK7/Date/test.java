package practise.time.JDK7.Date;

import java.util.Date;
import java.util.Random;

public class test {
    public static void main(String[] args) {
//        extracted();
        Random r = new Random();
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        System.out.println(d1);
        System.out.println(d2);
        if(d1.getTime()>d2.getTime()){
            System.out.println(d2+"��"+d1+"ǰ");
        } else if (d1.getTime() == d2.getTime()) {
            System.out.println(d1+"="+d2);
        }else {
            System.out.println(d1+"��"+d2+"ǰ");
        }
    }

    private static void extracted() {
        Date d1 = new Date();
        d1.setTime(1000L * 60 * 60 * 24 * 365);//����ʱ��
        System.out.println(d1);//��ӡʱ��

        System.out.println("==================");

        Date d2 = new Date(0L);//��ȡԭ��Ķ���
        long time = d2.getTime();//��ȡ����ԭ���ʱ�䣬��0
        System.out.println(time);//0
        time = time + 1000L * 60 * 60 * 24 * 365;
        d2.setTime(time);
        System.out.println(d2);
    }
}
