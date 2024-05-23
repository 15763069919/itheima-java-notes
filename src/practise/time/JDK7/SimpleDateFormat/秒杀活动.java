package practise.time.JDK7.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ��ɱ� {
    private static Date startDate;

    public static void main(String[] args) throws ParseException {
        String startStr = "2023��11��11�� 0:0:0";
        String endStr = "2023��11��11�� 0:10:0";
        String orderStr1 = "2023��11��11�� 0:01:00";
        String orderStr2 = "2023��11��11�� 0:11:0";

        //����
        //����SimpleDateFormat�������ø�ʽ
        SimpleDateFormat startSdf = new SimpleDateFormat("yyyy��MM��dd�� H:m:s");
        SimpleDateFormat endSdf = new SimpleDateFormat("yyyy��MM��dd�� H:mm:s");
        SimpleDateFormat order1Sdf = new SimpleDateFormat("yyyy��MM��dd�� H:mm:ss");
        SimpleDateFormat order2Sdf = new SimpleDateFormat("yyyy��MM��dd�� H:mm:s");
        //������Date���󲢽���
        Date startDate = startSdf.parse(startStr);
        Date endDate = endSdf.parse(endStr);
        Date order1Date = endSdf.parse(orderStr1);
        Date order2Date = endSdf.parse(orderStr2);

        //�õ�����ֵ
        long startTime = startDate.getTime();
//        System.out.println(startTime);
        long endTime = endDate.getTime();
//        System.out.println(endTime);
        long order1Time = order1Date.getTime();
//        System.out.println(order1Time);
        long order2Time = order2Date.getTime();
//        System.out.println(order2Time);

        //�Ƚ�
        if(order1Time > startTime && order1Time < endTime){
            System.out.println("����ɹ�");
        }else {
            System.out.println("����ʧ��");
        }
        if(order2Time > startTime && order2Time < endTime){
            System.out.println("����ɹ�");
        }else {
            System.out.println("����ʧ��");
        }

    }
}
