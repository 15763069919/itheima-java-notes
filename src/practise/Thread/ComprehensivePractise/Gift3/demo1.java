package practise.Thread.ComprehensivePractise.Gift3;

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
    public static void main(String[] args) {
        //��������
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);

        MyRunnable mr = new MyRunnable(list);
        Thread t1= new Thread(mr);
        Thread t2= new Thread(mr);
        Thread t3= new Thread(mr);
        Thread t4= new Thread(mr);
        Thread t5= new Thread(mr);

        t1.setName("�齱��1");
        t2.setName("�齱��2");
        t3.setName("�齱��3");
        t4.setName("�齱��4");
        t5.setName("�齱��5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
