package practise.networkProgram.ComprehensivePractice.A02_ReceptionAndFeedback;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //����������׽��ֶ��󲢰󶨶˿�
        ServerSocket ss = new ServerSocket(10088);

        //�ȴ��ͻ�������
        System.out.println("�ȴ��ͻ�������");
        Socket socket = ss.accept();
        System.out.println("�Ѿ��пͻ���������");

        //��ȡ�׽���������
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int b;

        //ϸ�ڣ�
        //read�����������ͨ���ж�ȡ����
        //���ǣ���Ҫ��һ��������ǣ��˴���ѭ���Ż�ֹͣ
        //���򣬳���ͻ�һֱͣ��read����ȴ���ȡ���������
        System.out.println("׼����ȡ�ͻ��˷���������");
        while ((b = isr.read()) != -1) {
            System.out.println("���ڶ�ȡ");
            System.out.println((char)b);
        }
        System.out.println("���ݶ�ȡ���");

        //��д����
        System.out.println("׼����д");
        String str = "�ж࿪��?";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());
        System.out.println("��д�ɹ�");


        //����
        socket.close();
        ss.close();

    }
}
