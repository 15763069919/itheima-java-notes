package practise.networkProgram.ComprehensivePractice.A05_multiThreadUploadFiles;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.连接客户端
        // 创建服务端套接字对象
        ServerSocket ss = new ServerSocket(10012);


        while(true){
            //死等连接获取客户端套接字
            Socket socket = ss.accept();

            System.out.println("客户端连接成功");
            new Thread(new MyRunnable(socket)).start();
        }
    }
}
