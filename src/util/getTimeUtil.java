package util;

public class getTimeUtil {
    private getTimeUtil(){}
    public static void getSystemTime() {
        //����ns��
        long startTime = System.nanoTime(); //��ȡ��ʼʱ��
        // Ҫ��ĳ���򷽷�
        long endTime = System.nanoTime(); //��ȡ����ʱ��
        System.out.println("��������ʱ�䣺 " + (endTime - startTime) + "ns");
    }
}
