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
        //����Socket���󲢻�ȡ�����
        Socket socket = new Socket(InetAddress.getByName("ckkk"), 10010);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //����
        Scanner sc = new Scanner(System.in);
        String str = null;
        while (true) {
            System.out.print(":");
            str = sc.nextLine();
            if (socket.equals("exit")) {
                break;
            } else {
                //��ȡʱ�䲢��ʽ��
                String formatNow = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss").format(LocalDateTime.now());
                //����
                bw.write(str + "\t\t("+formatNow+")");
                bw.newLine();
                //ˢ�»�����
                bw.flush();
            }
        }
        //����
        socket.close();
    }
}
