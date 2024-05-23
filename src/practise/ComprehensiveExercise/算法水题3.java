package practise.ComprehensiveExercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class �㷨ˮ��3 {
    public static void main(String[] args) throws ParseException {
        //JDK7
        //��ȡ���պ���
        //��������
        String birthday = "2005��3��11��";
        //����
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
        Date birthdayDate = sdf.parse(birthday);
        //��ȡ����ֵ
        long birthdayDateTime = birthdayDate.getTime();
        //��ȡ��ǰʱ��
        Date nowDate = new Date();
        long nowTime = nowDate.getTime();
        long time = nowTime - birthdayDateTime;
        System.out.println(time / 1000 / 60 / 60 / 24);


        //JDK8
        LocalDate birth = LocalDate.of(2005,3,11);
        LocalDate now = LocalDate.now();
        long between = ChronoUnit.DAYS.between(birth, now);

        System.out.println(between);
    }


}
