package practise.Thread.ThreadPool.CreateThreadPoolWithTool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo1 {
    public static void main(String[] args) {
        //1.��ȡ�̳߳ض���
//        ExecutorService pool1 = Executors.newCachedThreadPool();
        ExecutorService pool1 = Executors.newFixedThreadPool(3);

        //2.�ύ����
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());

        //3. �����̳߳� -- һ�㲻����
        //pool1.shutdown();
    }
}
