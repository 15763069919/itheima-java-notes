package practise.Thread.lock;

public class demo1 {
    public static void main(String[] args) {
        //�����̶߳���
       MyThread t1 = new MyThread();
       MyThread t2 = new MyThread();
       MyThread t3 = new MyThread();

        //����
        t1.setName("����1");
        t2.setName("����2");
        t3.setName("����3");

        //�����߳�
        t1.start();
        t2.start();
        t3.start();
    }
}
