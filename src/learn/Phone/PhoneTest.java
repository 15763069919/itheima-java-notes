package learn.Phone;

public class PhoneTest {
    public static void main(String[] args) {
        //�����ֻ��Ķ���
        Phone p = new Phone();

        //���ֻ���ֵ
        p.brand = "С��";
        p.price = 1999.98;

        //��ȡ�ֻ������е�ֵ
        System.out.println(p.brand);
        System.out.println(p.price);

        //�����ֻ��еķ���
        p.call();
        p.playGame();

        // ����еڶ����ֻ�����ô�� ?
        Phone p2 = new Phone();
        p2.brand = "ƻ��";
        p2.price = 8999;
        System.out.println(p2.brand);
        System.out.println(p2.price);
        p2.call();
        p2.playGame();
    }
}
