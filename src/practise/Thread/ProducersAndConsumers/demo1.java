package practise.Thread.ProducersAndConsumers;

public class demo1 {
    public static void main(String[] args) {
        //�����̶߳���
        Cook c = new Cook();
        Foodie f = new Foodie();
        c.setName("��ʦ");
        f.setName("�Ի�");
        c.start();
        f.start();


    }
}
