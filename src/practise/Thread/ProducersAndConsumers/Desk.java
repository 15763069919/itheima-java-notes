package practise.Thread.ProducersAndConsumers;

public class Desk {
    /*
    * ���ã����������ߺ������ߵ�ִ��
    * */

    //�Ƿ��������� 0 -- û��    1 -- ��
    public static int foodFlag = 0;

    //��ʾ�ܸ���
    public static int count = 10;

    //������
    public static Object lock = new Object();

}
