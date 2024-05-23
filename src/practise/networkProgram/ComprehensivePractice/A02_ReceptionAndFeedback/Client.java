package practise.networkProgram.ComprehensivePractice.A02_ReceptionAndFeedback;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //����Socket�������ӷ�����
        Socket socket = new Socket(InetAddress.getByName("ckkk"),10088);
        //д������
        String str = "������ܸ���";
        //��ȡ�����
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());

        //д��һ���������
        socket.shutdownOutput();

        //���շ���˻�д������
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int b;
        while((b=isr.read()) != -1){
            System.out.print((char)b);
        }

        socket.close();

    }
}
