package practise.Thread.ThreadSafeAndSynchronised.SynchronizedMethod;

public class demo1 {
    public static void main(String[] args) {
        //���������Ķ���
        MyRunnable mr = new MyRunnable();
        //�����̲߳������߳�Ҫ�ܵĲ���
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);
        t1.setName("����1");
        t2.setName("����2");
        t3.setName("����3");
        t1.start();
        t2.start();
        t3.start();

    }
}
