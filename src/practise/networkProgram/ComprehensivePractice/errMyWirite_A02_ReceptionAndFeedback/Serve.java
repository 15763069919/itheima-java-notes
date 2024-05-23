package practise.networkProgram.ComprehensivePractice.errMyWirite_A02_ReceptionAndFeedback;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Serve {
    public static void main(String[] args) throws IOException {
        //接收数据
        //创建ServeSocket对象并死等获得套接字对象
        ServerSocket ss = new ServerSocket(10011);
        Socket socket = ss.accept();
        //创建缓冲流对象
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        int len;
        char[] chars = new char[1024];

        //===========================================================================
        while ((len = br.read(chars)) != -1) {
            //读取
            System.out.println(new String(chars, 0, len));
            System.out.println("服务端：读取完成");

            //反馈
            //获取缓冲流
            //写入
            bw.write("发送成功！");
            bw.flush();
            System.out.println("服务端：发送反馈完成");
        }
        //===========================================================================


        System.out.println("服务端：while循环结束");
    }
}
