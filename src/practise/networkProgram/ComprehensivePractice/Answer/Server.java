package practise.networkProgram.ComprehensivePractice.Answer;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //�ͻ��ˣ�����һ�����ݣ����շ���˷�������Ϣ����ӡ
        //���������������ݲ���ӡ���ٸ��ͻ��˷�����Ϣ


        //1.�������󲢰�10000�˿�
        ServerSocket ss = new ServerSocket(10013);

        //2.�ȴ��ͻ�������
        Socket socket = ss.accept();

        //3.socket�л�ȡ��������ȡ����
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int b;
        //ϸ�ڣ�
        //read�����������ͨ���ж�ȡ����
        //���ǣ���Ҫ��һ��������ǣ��˴���ѭ���Ż�ֹͣ
        //���򣬳���ͻ�һֱͣ��read��������ȴ���ȡ���������
        while ((b = isr.read()) != -1){
            System.out.println((char)b);
        }

        //4.��д����
        String str = "�����ж࿪�ģ�";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());

        //�ͷ���Դ
        socket.close();
        ss.close();


    }
}