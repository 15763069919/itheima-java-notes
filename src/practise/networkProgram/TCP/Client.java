package practise.networkProgram.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        /*TCPЭ�鷢������*/
        //1������Socket����
        //ϸ�ڣ��ڴ��������ͬʱ�����ӷ�������������Ӳ����򱨴�
        Socket socket = new Socket(InetAddress.getByName("ckkk"),10000);

        //2.���Դ�����ͨ���л�ȡ�����
        OutputStream os = socket.getOutputStream();
        //д������
        os.write("�к�Ů��".getBytes());

        //3.�ͷ���Դ
        os.close();
        socket.close();
    }
}
