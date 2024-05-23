package practise.Thread.ComprehensivePractise.demo2;

public class demo2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("张三");
        t2.setName("李四");
        t1.start();
        t2.start();
    }
}
