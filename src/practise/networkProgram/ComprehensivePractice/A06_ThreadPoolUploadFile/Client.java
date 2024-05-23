package practise.networkProgram.ComprehensivePractice.A06_ThreadPoolUploadFile;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //1.�����׽��ֶ���
        Socket socket = new Socket(InetAddress.getByName("ckkk"), 10012);
        System.out.println("��������ӳɹ�");

        //2.��ȡ�ļ� д�������
        //ʹ���ֽ���
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/practise/networkProgram/ComprehensivePractice/A06_ThreadPoolUploadFile/a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        System.out.println("�ļ���ȡ�ɹ�");
        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.flush();
        System.out.println("�ļ��ϴ��ɹ�");

        //������־
        socket.shutdownOutput();

        //3.���շ���
        BufferedReader sbr =new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        System.out.println("׼�����շ���");
        while((line = sbr.readLine()) != null){
            System.out.println("��ʼ���շ���");
            System.out.print(line);
        }
        System.out.println("���շ������");

        //4.����
        sbr.close();
        bis.close();
        socket.close();
    }
}
