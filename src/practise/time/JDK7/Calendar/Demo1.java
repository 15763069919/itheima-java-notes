package practise.time.JDK7.Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date d = new Date(0L);
        c.setTime(d);
//        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd EE HH:mm:ss");
        System.out.println(sdf.format(d));

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH)+1);//�·���0-11������+1
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(getWeek(c.get(Calendar.DAY_OF_WEEK)));

        c.set(Calendar.YEAR,2023);
        System.out.println(c.get(Calendar.YEAR));

        c.add(Calendar.MONTH,2);
        System.out.println(c.get(Calendar.MONTH)+1);//�·���0-11������+1

    
    }

    //�������ַ��ض�Ӧ������
    public static String getWeek(int index){
        String[] arr = {"","��","һ","��","��","��","��","��"};
        return "����"+arr[index];
    }
}
