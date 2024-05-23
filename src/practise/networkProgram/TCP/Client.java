package practise.networkProgram.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        /*TCP协议发送数据*/
        //1。创建Socket对象
        //细节：在创建对象的同时会连接服务器，如果连接不上则报错
        Socket socket = new Socket(InetAddress.getByName("ckkk"),10000);

        //2.可以从连接通道中获取输出流
        OutputStream os = socket.getOutputStream();
        //写出数据
        os.write("男孩女孩".getBytes());

        //3.释放资源
        os.close();
        socket.close();
    }
}
