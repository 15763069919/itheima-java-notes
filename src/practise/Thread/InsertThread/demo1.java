package practise.Thread.InsertThread;

public class demo1 {
    public static void main(String[] args) throws InterruptedException {
        //�����߳�
        MyThread t1 = new MyThread();
        //�����߳�����
        t1.setName("����");
        //�����߳�
        t1.start();

        //���������̵߳���ǰ�߳�֮ǰ
        t1.join();

        //ִ����main�߳��е�
        for (int i = 0; i < 100; i++) {
            System.out.println("main�߳�"+i);
        }


    }
}
