package practise.Thread.ComityThread;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName()+"@"+i);
        }

        //原来：抢到执行权一直执行知道执行权被夺走
        //出让当前CPU的执行权 -- 抢到执行权后执行一次，然后重新抢夺执行权
        Thread.yield();
    }
}
