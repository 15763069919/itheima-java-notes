package practise.Thread.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class demo1 {
    public static void main(String[] args) {
        //1.�����������еĶ���
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        //�����̵߳Ķ��󲢰��������д��ݹ�ȥ
        Cook c = new Cook(queue);
        Foodie f = new Foodie(queue);

        //�����߳�
        c.start();
        f.start();









    }
}
