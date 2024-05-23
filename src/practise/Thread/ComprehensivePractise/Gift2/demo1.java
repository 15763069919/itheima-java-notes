package practise.Thread.ComprehensivePractise.Gift2;

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
    public static void main(String[] args) {
        //´´½¨½±³Ø
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);

        MyRunnable mr = new MyRunnable(list);
        Thread t1= new Thread(mr);
        Thread t2= new Thread(mr);

        t1.setName("³é½±³Ø1");
        t2.setName("³é½±³Ø2");

        t1.start();
        t2.start();
    }
}
