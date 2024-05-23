package practise.networkProgram.ComprehensivePractice.A01_multipleSendAndReceive;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建Socket对象并获取输出流
        Socket socket = new Socket(InetAddress.getByName("ckkk"), 10010);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //键入
        Scanner sc = new Scanner(System.in);
        String str = null;
        while (true) {
            System.out.print(":");
            str = sc.nextLine();
            if (socket.equals("exit")) {
                break;
            } else {
                //获取时间并格式化
                String formatNow = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss").format(LocalDateTime.now());
                //发送
                bw.write(str + "\t\t("+formatNow+")");
                bw.newLine();
                //刷新缓冲区
                bw.flush();
            }
        }
        //关流
        socket.close();
    }
}
