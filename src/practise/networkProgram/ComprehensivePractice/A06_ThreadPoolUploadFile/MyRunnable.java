package practise.networkProgram.ComprehensivePractice.A06_ThreadPoolUploadFile;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunnable implements Runnable{
    public Socket socket;

    public MyRunnable(Socket socket) {
        this.socket = socket;
    }

    /**
     *
     */
    @Override
    public void run() {
        try {
            //2.��ȡ�ļ������浽�����ļ�
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            //�������
            String randomName = UUID.randomUUID().toString().replace("-", "");
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/practise/networkProgram/ComprehensivePractice/A06_ThreadPoolUploadFile/" + randomName + ".txt"));
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            System.out.println("׼����ȡ�ļ�");
            while ((len = bis.read(bytes)) != -1) {
                System.out.println("��ȡ��һ�Σ���ʼд�뱾��");
                bos.write(bytes, 0, len);
                System.out.println("д���걾��һ��");
            }
            bos.flush();
            System.out.println("�ļ�����ɹ�");

            //3.����
            BufferedWriter  sbw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            System.out.println("׼������");
            sbw.write("�ϴ��ɹ���");
            System.out.println("�������");
            sbw.newLine();
            sbw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //4.����
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
