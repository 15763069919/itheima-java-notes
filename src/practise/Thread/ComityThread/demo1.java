package practise.Thread.ComityThread;

public class demo1 {
    public static void main(String[] args) {
        //�����̶߳���
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        //��������
        t1.setName("�ɻ�");
        t2.setName("̹��");



        t1.start();
        t2.start();
    }
}
