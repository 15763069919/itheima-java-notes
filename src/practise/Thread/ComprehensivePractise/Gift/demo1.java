package practise.Thread.ComprehensivePractise.Gift;

public class demo1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("�齱��1");
        t2.setName("�齱��2");

        t1.start();
        t2.start();
    }
}
