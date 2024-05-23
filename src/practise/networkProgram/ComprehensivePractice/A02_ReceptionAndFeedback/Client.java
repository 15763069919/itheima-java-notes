package practise.networkProgram.ComprehensivePractice.A02_ReceptionAndFeedback;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建Socket对象并连接服务器
        Socket socket = new Socket(InetAddress.getByName("ckkk"),10088);
        //写出数据
        String str = "见到你很高兴";
        //获取输出流
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());

        //写出一个结束标记
        socket.shutdownOutput();

        //接收服务端回写的数据
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int b;
        while((b=isr.read()) != -1){
            System.out.print((char)b);
        }

        socket.close();

    }
}
