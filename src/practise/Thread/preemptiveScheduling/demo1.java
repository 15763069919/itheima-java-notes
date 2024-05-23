package practise.Thread.preemptiveScheduling;

public class demo1 {
    public static void main(String[] args) {
        //创建线程要执行的参数的对象
        MyRunnable mr = new MyRunnable();
        //创建线程对象
        Thread t1 = new Thread(mr,"飞机");
        Thread t2 = new Thread(mr,"坦克");
        /*System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(Thread.currentThread().getPriority());*/

        //设置优先级
        t1.setPriority(1);
        t2.setPriority(10);
        //启动
        t1.start();
        t2.start();
    }
}
