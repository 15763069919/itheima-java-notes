package practise.time.JDK7.Date;

import java.util.Date;

public class ʱ����� {
    public static void main(String[] args) {
       /*
       public date() ����date���󣬱�ʾ��ǰʱ��
    public date(long date) ����date���󣬱�ʾָ��ʱ��
    public void settime(long time) ����/�޸ĺ���ֵ
    public long gettime() ��ȡʱ�����ĺ���ֵ
        */
        Date d1 = new Date();
        System.out.println(d1);//��ӡ����ϵͳ��ǰʱ��
        System.out.println(d1.getTime());//��ӡ����ϵͳ��ǰʱ��ĺ���

        System.out.println("=====================");

        Date d2 = new Date(0L);//����ָ��ʱ��Ķ��󣬵�λ�Ǻ���
        System.out.println(d2);//��ӡ����1970.1.1 ����8:00
        System.out.println(d2.getTime());//��ӡ����1970.1.1 ����8:00��ָ��ʱ��ĺ���ֵ
        d2.setTime(1000L);//���ú���ֵ
        System.out.println(d2);//��ӡ�޸ĺ����ֵ��ʱ�䣨��1970.1.1 ����8:00�ϵ��ӣ�
        System.out.println(d2.getTime());//��ӡ����1970.1.1 ����8:00��ʱ��ĺ���



    }
}
