package practise.Thread.ThreeWaysToImplementMultithreading.Second_ImplementsRunnable;

public class demo1 {
    public static void main(String[] args) {
        /*
        * ���̵߳ĵڶ���������ʽ��
        *   1.�Լ�����һ����ʵ��Runnable�ӿ�
        *   2.��д�����run����
        *   3.�����Լ�����Ķ���
        *   4.����һ��Thread��Ķ��󣬲������߳�
        * */


        //����MyRun�Ķ��� -- ��ʾ���߳�Ҫִ�е�����
        MyRun mr = new MyRun();
        //�����̶߳���
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        //��������
        t1.setName("�߳�1");
        t2.setName("�߳�2");

        //�����߳�
        t1.start();
        t2.start();
    }
}
