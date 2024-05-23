package practise.networkProgram.TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        /*TCP协议接收数据*/
        //1.创建ServeSocket对象
        ServerSocket ss = new ServerSocket(10000);
        //2.监听客户端连接并获取客户端连接对象
        Socket socket = ss.accept();//死等连接
        //3.从连接通道中获取输入流读取数据
        /*InputStream is = socket.getInputStream();
        //使中文不乱码
        InputStreamReader isr = new InputStreamReader(is);
        //提高读取效率
        BufferedReader br = new BufferedReader(isr);*/
        //三行合一行
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int b;
        while ((b = br.read() )!= -1) {
            System.out.print((char)b);
        }
        //4.释放资源
        socket.close(); //断开连接
        ss.close();//关闭服务器
    }
}
