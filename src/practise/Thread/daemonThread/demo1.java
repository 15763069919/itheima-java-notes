package practise.Thread.daemonThread;


public class demo1 {
    public static void main(String[] args) {
        //创建线程对象
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        //设置名字
        t1.setName("女神");
        t2.setName("备胎");

        t2.setDaemon(true);

        t1.start();
        t2.start();

    }
}
