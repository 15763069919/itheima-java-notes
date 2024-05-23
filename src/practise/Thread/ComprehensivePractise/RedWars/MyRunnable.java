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
                System.out.println(Thread.currentThread().getName() + "û���������!");
            } else {
                //���һ����
                double prize = 0;
                if (count == 1) {
                    prize = money;
                } else {
                    Random r = new Random();
                    //100Ԫ��3��������һ�������99.8
                    prize = r.nextDouble(money - (count - 1) * MIN);
                    if (prize < MIN) {
                        prize = MIN;
                    }
                }
                //�������
                money -= prize;
                //�������-1
                count--;

                System.out.println(Thread.currentThread().getName()+"������"+prize+"Ԫ");
            }
        }
    }
}
