package practise.networkProgram.ComprehensivePractice.errMyWirite_A02_ReceptionAndFeedback;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Serve {
    public static void main(String[] args) throws IOException {
        //��������
        //����ServeSocket�������Ȼ���׽��ֶ���
        ServerSocket ss = new ServerSocket(10011);
        Socket socket = ss.accept();
        //��������������
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        int len;
        char[] chars = new char[1024];

        //===========================================================================
        while ((len = br.read(chars)) != -1) {
            //��ȡ
            System.out.println(new String(chars, 0, len));
            System.out.println("����ˣ���ȡ���");

            //����
            //��ȡ������
            //д��
            bw.write("���ͳɹ���");
            bw.flush();
            System.out.println("����ˣ����ͷ������");
        }
        //===========================================================================


        System.out.println("����ˣ�whileѭ������");
    }
}
