package practise.Thread.ThreadSafeAndSynchronised.SynchronizedMethod;

public class MyRunnable implements Runnable {
    int ticket = 0;

    @Override
    public void run() {
        while (true) {
                if (method()) break;
        }
    }

    private synchronized boolean method() {
        if (ticket < 100) {//票没卖完
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
        } else {
            return true;
        }
        return false;
    }
}
