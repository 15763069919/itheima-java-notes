package practise.Thread.ComprehensivePractise.Gift;

import java.util.Random;

public class MyThread extends Thread {
    static int[] arr = {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700};
    static int count = 12;

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (count == 0) {
                    break;
                } else {
                    Random r = new Random();
                    int index;
                    while (true) {
                        index = r.nextInt(arr.length);

                        if (arr[index] != 0) break;
                    }
                    count--;
                    System.out.println(getName() + "又产生了一个" + arr[index] + "元大奖");
                    arr[index] = 0;
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
