package practise.Thread.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class demo1 {
    public static void main(String[] args) {
        //1.创建阻塞队列的对象
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        //创建线程的对象并把阻塞队列传递过去
        Cook c = new Cook(queue);
        Foodie f = new Foodie(queue);

        //开启线程
        c.start();
        f.start();









    }
}
