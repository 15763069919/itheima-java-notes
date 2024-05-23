package practise.Thread.ComprehensivePractise.RedWars;


public class demo1 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);
        Thread t4 = new Thread(mr);
        Thread t5 = new Thread(mr);

        t1.setName("A");
        t2.setName("B");
        t3.setName("C");
        t4.setName("D");
        t5.setName("E");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
