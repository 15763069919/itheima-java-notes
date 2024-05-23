package practise.networkProgram.ComprehensivePractice.A02_ReceptionAndFeedback;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务端套接字对象并绑定端口
        ServerSocket ss = new ServerSocket(10088);

        //等待客户端连接
        System.out.println("等待客户端连接");
        Socket socket = ss.accept();
        System.out.println("已经有客户端来连接");

        //获取套接字输入流
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int b;

        //细节：
        //read方法会从连接通道中读取数据
        //但是，需要有一个结束标记，此处的循环才会停止
        //否则，程序就会一直停到read这里，等待读取下面的数据
        System.out.println("准备读取客户端发来的数据");
        while ((b = isr.read()) != -1) {
            System.out.println("正在读取");
            System.out.println((char)b);
        }
        System.out.println("数据读取完毕");

        //回写数据
        System.out.println("准备回写");
        String str = "有多开心?";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());
        System.out.println("回写成功");


        //关流
        socket.close();
        ss.close();

    }
}
