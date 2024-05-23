package practise.Thread.InsertThread;

public class demo1 {
    public static void main(String[] args) throws InterruptedException {
        //创建线程
        MyThread t1 = new MyThread();
        //设置线程名称
        t1.setName("土豆");
        //开启线程
        t1.start();

        //插入土豆线程到当前线程之前
        t1.join();

        //执行在main线程中的
        for (int i = 0; i < 100; i++) {
            System.out.println("main线程"+i);
        }


    }
}
