package practise.networkProgram.ComprehensivePractice.A03_uploadFiles;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.���ӿͻ���
        // ����������׽��ֶ���
        ServerSocket ss = new ServerSocket(10012);

        //�������ӻ�ȡ�ͻ����׽���
        Socket socket = ss.accept();

        //2.��ȡ�ļ������浽�����ļ�
        //��ȡ�׽���������
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        //�����ļ������
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/practise/networkProgram/ComprehensivePractice/A03_uploadFiles/a_copy.txt"));
        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.flush();

        //3.����
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("������ˡ����ϴ��ɹ���");
        bw.newLine();
        bw.flush();

        //4.����
        bos.close();
        socket.close();
        ss.close();
    }
}
