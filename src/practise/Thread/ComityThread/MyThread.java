package practise.Thread.ComityThread;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName()+"@"+i);
        }

        //ԭ��������ִ��Ȩһֱִ��֪��ִ��Ȩ������
        //���õ�ǰCPU��ִ��Ȩ -- ����ִ��Ȩ��ִ��һ�Σ�Ȼ����������ִ��Ȩ
        Thread.yield();
    }
}
