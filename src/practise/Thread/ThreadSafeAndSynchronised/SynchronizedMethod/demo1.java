package practise.Thread.ThreadSafeAndSynchronised.SynchronizedMethod;

public class demo1 {
    public static void main(String[] args) {
        //创建参数的对象
        MyRunnable mr = new MyRunnable();
        //创建线程并传递线程要跑的参数
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();

    }
}
