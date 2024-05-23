package practise.networkProgram.TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        /*TCPЭ���������*/
        //1.����ServeSocket����
        ServerSocket ss = new ServerSocket(10000);
        //2.�����ͻ������Ӳ���ȡ�ͻ������Ӷ���
        Socket socket = ss.accept();//��������
        //3.������ͨ���л�ȡ��������ȡ����
        /*InputStream is = socket.getInputStream();
        //ʹ���Ĳ�����
        InputStreamReader isr = new InputStreamReader(is);
        //��߶�ȡЧ��
        BufferedReader br = new BufferedReader(isr);*/
        //���к�һ��
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int b;
        while ((b = br.read() )!= -1) {
            System.out.print((char)b);
        }
        //4.�ͷ���Դ
        socket.close(); //�Ͽ�����
        ss.close();//�رշ�����
    }
}
