package practise.networkProgram.ComprehensivePractice.A04_uploadFilesRandomFileName;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.���ӿͻ���
        // ����������׽��ֶ���
        ServerSocket ss = new ServerSocket(10012);

        //�������ӻ�ȡ�ͻ����׽���
        Socket socket = ss.accept();
        System.out.println("�ͻ������ӳɹ�");

        //2.��ȡ�ļ������浽�����ļ�
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        //�������
        String randomName = UUID.randomUUID().toString().replace("-", "");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/practise/networkProgram/ComprehensivePractice/A04_uploadFilesRandomFileName/"+randomName+".txt"));
        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        System.out.println("�ļ�����ɹ�");

        //3.����
        BufferedWriter sbw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        sbw.write("�ϴ��ɹ���");
        sbw.newLine();
        sbw.flush();

        //4.����
        sbw.close();
        bos.close();
        socket.close();
        ss.close();
    }
}
