package practise.Thread.ComprehensivePractise.Gift3;

import java.util.ArrayList;
import java.util.Collections;

public class MyRunnable implements Runnable {
    ArrayList<Integer> list;

    public MyRunnable(ArrayList<Integer> list) {
        this.list = list;
    }


    /**
     *
     */
    @Override
    public void run() {
        //-----------------------------------------------
        ArrayList<Integer> boxList = new ArrayList<>();
        //-----------------------------------------------

        while (true) {
            synchronized (MyRunnable.class) {
                if (list.size() == 0) {
                    //---------------------------------------------------------------
                    System.out.println(Thread.currentThread().getName() + boxList);
                    //---------------------------------------------------------------
                    break;
                } else {
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    //-------------------
                    boxList.add(prize);
                    //-------------------
//                    System.out.println(Thread.currentThread().getName()+"�ֲ�����һ��"+prize+"Ԫ��");
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
