package practise.Thread.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{
    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
         //���ϵİ�������������������
        while (true) {
            try {
                queue.put("����");
                System.out.println("��ʦ����һ������");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
