package practise.ComprehensiveExercise;

import java.time.LocalDate;
import java.util.Calendar;

public class �㷨ˮ��4 {
    public static void main(String[] args) {
        /*�ж������һ����������껹��ƽ��
        Ҫ����jdk7��jdk8���ַ�ʽ�ж�
        ��ʾ��
              ������29��������
              һ����366��������*/

        //JDK7
        //����¼��
//        System.out.println("������һ����ݣ�");
//        Scanner sc = new Scanner(System.in);
//        int year1 = Integer.parseInt(sc.nextLine());
        int year1 = 2000;

        //��һ��2001.3.1��ǰ��ȥһ�죬������28�Ż���29��
        //
        //������������Ĭ�ϵ�ǰʱ��
        Calendar instance1 = Calendar.getInstance();
        //�޸�ʱ��
        instance1.set(year1,Calendar.MARCH,1);
        //day-1
        instance1.add(Calendar.DAY_OF_MONTH,-1);
        int day1 = instance1.get(Calendar.DAY_OF_MONTH);
        System.out.println(day1);
        if(day1 == 29){
            System.out.println("����");
        }else {
            System.out.println("ƽ��");
        }

        //������2001.1.1��ǰ��ȥһ�죬�������2000.1.1���ж�����
        //
        Calendar instance2 = Calendar.getInstance();
        instance2.set(2001, Calendar.JANUARY,1);
        instance2.add(Calendar.DAY_OF_MONTH,-1);
        int day2 = instance2.get(Calendar.DAY_OF_YEAR);
        System.out.println(day2);
        if(day2 == 366){
            System.out.println("����");
        }else {
            System.out.println("ƽ��");
        }


        System.out.println("===============================");

        //JDK8
        //
        //��һ
        LocalDate localDate = LocalDate.of(2000, 3, 1);
        LocalDate localDate1 = localDate.minusDays(1);
        System.out.println(localDate1);
        if(localDate1.getDayOfMonth() == 29){
            System.out.println("����");
        }else {
            System.out.println("ƽ��");
        }

        //����
        LocalDate localDate2 = LocalDate.of(2001, 1, 1);
        LocalDate localDate3 = localDate2.minusDays(1);
        if(localDate3.getDayOfYear() == 366){
            System.out.println("����");
        }else {
            System.out.println("ƽ��");
        }

        //����
        LocalDate localDate4 = LocalDate.of(2000, 1, 1);
        boolean leapYear = localDate4.isLeapYear();
        System.out.println(leapYear);
    }
}
