package practise.Thread.ComprehensivePractise.Gift4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    ArrayList<Integer> list;

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }

    /**
     * @return
     * @throws Exception
     */
    @Override
    public Integer call() throws Exception {
        //-----------------------------------------------
        ArrayList<Integer> boxList = new ArrayList<>();
        //-----------------------------------------------

        while (true) {
            synchronized (MyCallable.class) {
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
//                    System.out.println(Thread.currentThread().getName()+"又产生了一个"+prize+"元大奖");
                }

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        if (boxList.size() == 0) {
            return null;
        } else {
            return Collections.max(boxList);
        }
    }
}
