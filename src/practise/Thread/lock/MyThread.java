package practise.Thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    static int ticket = 0; //0~99

    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {

            //����
            lock.lock();

            try {
                //�ѹ������ݵĴ����������
                if (ticket < 100) {//Ʊû����
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName() + "��������" + ticket + "��Ʊ");
                } else {
                    break;
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            } finally {
                //�ͷ���
                lock.unlock();
            }

        }
    }
}
