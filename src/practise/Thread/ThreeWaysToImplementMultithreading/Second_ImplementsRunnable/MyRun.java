package practise.Thread.ThreeWaysToImplementMultithreading.Second_ImplementsRunnable;

public class MyRun implements Runnable{
    /**
     *
     */
    @Override
    public void run() {
        //��д�߳�Ҫִ�еĴ���
        for (int i = 0; i < 100; i++) {
            //��ȡ����ǰ�̵߳Ķ���
            /*Thread t = Thread.currentThread();
            System.out.println(t.getName()+"hello world");*/
            System.out.println(Thread.currentThread().getName()+"hello world");
        }
    }
}
