package practise.Thread.ComprehensivePractise.demo1;

public class MyRunnable implements Runnable {
    int ticket = 1000;

    /**
     *
     */
    @Override
    public void run() {
        while (true) {
            synchronized (MyRunnable.class) {
                if (ticket == 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "送出了一张电影票，还有" + ticket + "张");
                }
            }
        }
    }
}
