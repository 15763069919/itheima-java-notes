package practise.Thread.preemptiveScheduling;

public class demo1 {
    public static void main(String[] args) {
        //�����߳�Ҫִ�еĲ����Ķ���
        MyRunnable mr = new MyRunnable();
        //�����̶߳���
        Thread t1 = new Thread(mr,"�ɻ�");
        Thread t2 = new Thread(mr,"̹��");
        /*System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(Thread.currentThread().getPriority());*/

        //�������ȼ�
        t1.setPriority(1);
        t2.setPriority(10);
        //����
        t1.start();
        t2.start();
    }
}
