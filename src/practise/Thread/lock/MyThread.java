package practise.Thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    static int ticket = 0; //0~99

    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {

            //加锁
            lock.lock();

            try {
                //把共享数据的代码给锁起来
                if (ticket < 100) {//票没卖完
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                } else {
                    break;
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            } finally {
                //释放锁
                lock.unlock();
            }

        }
    }
}
