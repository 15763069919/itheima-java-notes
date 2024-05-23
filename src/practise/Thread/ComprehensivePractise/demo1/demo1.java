package practise.Thread.ComprehensivePractise.demo1;

public class demo1 {
    public static void main(String[] args) {
        //创建参数对象
        MyRunnable mr = new MyRunnable();
        //创建线程对象并传递参数
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        //设置名字
        t1.setName("窗口1");
        t2.setName("窗口2");
        //开启线程
        t1.start();
        t2.start();
    }
}
