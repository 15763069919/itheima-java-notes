package practise.networkProgram.ComprehensivePractice.A05_multiThreadUploadFiles;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.���ӿͻ���
        // ����������׽��ֶ���
        ServerSocket ss = new ServerSocket(10012);


        while(true){
            //�������ӻ�ȡ�ͻ����׽���
            Socket socket = ss.accept();

            System.out.println("�ͻ������ӳɹ�");
            new Thread(new MyRunnable(socket)).start();
        }
    }
}
