package practise.Thread.ComprehensivePractise.Gift2;

import java.util.ArrayList;
import java.util.Collections;

public class MyRunnable implements Runnable {
    ArrayList<Integer> list;

    public MyRunnable(ArrayList<Integer> list) {
        this.list = list;
    }

    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    /**
     *
     */
    @Override
    public void run() {
        while (true) {
            synchronized (MyRunnable.class) {
                if (list.size() == 0) {
                    if (Thread.currentThread().getName().equals("线程1")) {
                        System.out.println("抽奖箱1"+list1);
                    } else {
                        System.out.println("抽奖箱2"+list2);
                    }
                    break;
                } else {
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    list1.add(prize);
                    if (Thread.currentThread().getName().equals("线程1")) {
                        list1.add(prize);
                    } else {
                        list2.add(prize);
                    }
//                    System.out.println(Thread.currentThread().getName()+"又产生了一个"+prize+"元大奖");
                }

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
