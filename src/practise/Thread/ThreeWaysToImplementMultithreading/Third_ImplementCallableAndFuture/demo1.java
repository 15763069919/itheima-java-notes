package practise.Thread.ThreeWaysToImplementMultithreading.Third_ImplementCallableAndFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class demo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        * 多线程第三种实现方式：
        *   特点：可以获取到多线程运行的结果
        *
        *   1.创建一个类MyCallable实现Callable接口
        *   2.重写call   （有返回值，返回值表示多线程的运行结果）
        *   3.创建MyCallable对象（表示多线程要执行的任务）
        *   4.创建FutureTask的对象（作用管理多线程运行的结果）
        *   5.创建Thread类的对象（表示线程），并启动
        * */

        //创建MyCallable表示多线程要执行的任务
        MyCallable mc = new MyCallable();
        //创建FutureTask对象管理多线程运行的结果
        FutureTask<Integer> ft = new FutureTask<>(mc);
        //创建线程的对象
        Thread t1 = new Thread(ft);
        //启动线程
        t1.start();
        //获取多线程运行的结果
        Integer result = ft.get();
        System.out.println(result);

    }
}
