package practise.networkProgram.ComprehensivePractice.A01_multipleSendAndReceive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //����ServeSocket�������ӿͻ���
        ServerSocket ss = new ServerSocket(10010);
        Socket socket = ss.accept();//���ȣ��ȵ��˻�ȡ�׽���
        //��������������
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //��ȡ
        while (true) {
            int len;
            char[] chars = new char[1024];
            while((len=br.read(chars)) != -1){
                System.out.print(new String(chars,0,len));
            }
        }
    }
}
