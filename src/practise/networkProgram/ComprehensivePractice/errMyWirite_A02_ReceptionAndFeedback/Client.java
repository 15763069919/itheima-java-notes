package practise.networkProgram.ComprehensivePractice.errMyWirite_A02_ReceptionAndFeedback;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建客户端套接字对象
        Socket socket = new Socket(InetAddress.getByName("ckkk"), 10011);
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        //获取套接字输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //定义长度
        int len;
        //定义字符数组接收
//        char[] chars = new char[1024];
//        while (true) {
            System.out.print(":");
            //接收键盘输入
            String str = sc.nextLine();
//            if (str.equals("exit")) break;
//            else {
                //创建缓冲流
                bw.write(str + "\t\t(" + DateTimeFormatter.ofPattern("yy.MM.dd HH:mm:ss").format(LocalDateTime.now()) + ")");
                bw.flush();
                System.out.println("客户端：发送完成");
                //读取
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                //==============================================================================
                while ((len = br.read(/*chars*/)) != -1) {
                    System.out.println("【服务器】："/* + new String(chars, 0, len)*/+len);
                }
                //==============================================================================

                System.out.println("客户端：接收反馈完成");
                System.out.println("客户端：接收的while结束");
//            }
            System.out.println("客户端：第二次准备发送消息");
//        }
        System.out.println("客户端：任务的while完成");
        //关流
        socket.close();
    }
}
