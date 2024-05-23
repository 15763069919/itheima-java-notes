package practise.Thread.ComityThread;

public class demo1 {
    public static void main(String[] args) {
        //创建线程对象
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        //设置名字
        t1.setName("飞机");
        t2.setName("坦克");



        t1.start();
        t2.start();
    }
}
