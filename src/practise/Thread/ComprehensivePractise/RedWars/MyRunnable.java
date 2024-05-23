package practise.Thread.ComprehensivePractise.RedWars;

import java.util.Random;

public class MyRunnable implements Runnable {
    int money = 100;
    int count = 3;
    final double MIN = 0.01;

    /**
     *
     */
    @Override
    public void run() {
        synchronized (MyRunnable.class) {
            if (count == 0) {
                System.out.println(Thread.currentThread().getName() + "没有抢到红包!");
            } else {
                //最后一个包
                double prize = 0;
                if (count == 1) {
                    prize = money;
                } else {
                    Random r = new Random();
                    //100元，3个包，第一次最多抢99.8
                    prize = r.nextDouble(money - (count - 1) * MIN);
                    if (prize < MIN) {
                        prize = MIN;
                    }
                }
                //减掉金额
                money -= prize;
                //红包个数-1
                count--;

                System.out.println(Thread.currentThread().getName()+"抢到了"+prize+"元");
            }
        }
    }
}
