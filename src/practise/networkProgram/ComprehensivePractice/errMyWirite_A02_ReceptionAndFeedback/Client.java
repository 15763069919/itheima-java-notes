package practise.networkProgram.ComprehensivePractice.errMyWirite_A02_ReceptionAndFeedback;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //�����ͻ����׽��ֶ���
        Socket socket = new Socket(InetAddress.getByName("ckkk"), 10011);
        //����Scanner����
        Scanner sc = new Scanner(System.in);
        //��ȡ�׽��������
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //���峤��
        int len;
        //�����ַ��������
//        char[] chars = new char[1024];
//        while (true) {
            System.out.print(":");
            //���ռ�������
            String str = sc.nextLine();
//            if (str.equals("exit")) break;
//            else {
                //����������
                bw.write(str + "\t\t(" + DateTimeFormatter.ofPattern("yy.MM.dd HH:mm:ss").format(LocalDateTime.now()) + ")");
                bw.flush();
                System.out.println("�ͻ��ˣ��������");
                //��ȡ
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                //==============================================================================
                while ((len = br.read(/*chars*/)) != -1) {
                    System.out.println("������������"/* + new String(chars, 0, len)*/+len);
                }
                //==============================================================================

                System.out.println("�ͻ��ˣ����շ������");
                System.out.println("�ͻ��ˣ����յ�while����");
//            }
            System.out.println("�ͻ��ˣ��ڶ���׼��������Ϣ");
//        }
        System.out.println("�ͻ��ˣ������while���");
        //����
        socket.close();
    }
}
