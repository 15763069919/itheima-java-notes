package practise.Thread.ComprehensivePractise.demo1;

public class demo1 {
    public static void main(String[] args) {
        //������������
        MyRunnable mr = new MyRunnable();
        //�����̶߳��󲢴��ݲ���
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        //��������
        t1.setName("����1");
        t2.setName("����2");
        //�����߳�
        t1.start();
        t2.start();
    }
}
