package practise.networkProgram.ComprehensivePractice.A03_uploadFiles;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //1.�����׽��ֶ���
        Socket socket = new Socket(InetAddress.getByName("ckkk"), 10012);

        //2.��ȡ�ļ� д�������
        //�����ļ�������
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/practise/networkProgram/ComprehensivePractice/A03_uploadFiles/a.txt"));
        //��ȡ�׽��������д��ͨ��
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.flush();

        socket.shutdownOutput();

        //3.���շ���
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while((line=br.readLine()) != null){
            System.out.println(line);
        }


        //4.����
        bis.close();
        socket.close();
    }
}
