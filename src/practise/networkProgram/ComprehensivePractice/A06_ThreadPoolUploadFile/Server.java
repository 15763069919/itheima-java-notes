package practise.networkProgram.ComprehensivePractice.A06_ThreadPoolUploadFile;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.连接客户端
        // 创建服务端套接字对象
        ServerSocket ss = new ServerSocket(10012);

        //创建线程池对象
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,//核心线程数
                16,//最大线程数
                60,//空闲时间
                TimeUnit.SECONDS,//空闲时间单位
                new ArrayBlockingQueue<>(2),//阻塞队列
                Executors.defaultThreadFactory(),//线程工厂，让线程池如何创建对对象
                new ThreadPoolExecutor.AbortPolicy());//任务拒绝策略


        while (true) {
            //死等连接获取客户端套接字
            Socket socket = ss.accept();

            System.out.println("客户端连接成功");
//            new Thread(new MyRunnable(socket)).start();
            pool.submit(new MyRunnable(socket));
        }
    }
}
