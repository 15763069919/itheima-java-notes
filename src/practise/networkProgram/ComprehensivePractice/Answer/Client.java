package practise.networkProgram.ComprehensivePractice.Answer;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //�ͻ��ˣ�����һ�����ݣ����շ���˷�������Ϣ����ӡ
        //���������������ݲ���ӡ���ٸ��ͻ��˷�����Ϣ



        //1.����Socket�������ӷ����
        Socket socket = new Socket(InetAddress.getByName("ckkk"),10013);


        //2.д������
        String str = "������ܸ��ˣ�";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());

        //д��һ���������
//        socket.shutdownOutput();


        //3.���շ���˻�д������
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int b;
        while ((b = isr.read()) != -1){
            System.out.print((char)b);
        }


        //�ͷ���Դ
        socket.close();


    }
}