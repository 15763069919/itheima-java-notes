package practise.networkProgram.UDP.comprehensivePractice.ChatRooms;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Send {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        //1.����DatagramPacket���󣨿�ݹ�˾��,ʹ������˿ڷ���
        DatagramSocket ds = new DatagramSocket();
        while (true) {
            //һ����������
            //2.������ݣ���ȡ���ݵ��ֽ����飩
            System.out.println("���룺");
            String str = sc.nextLine();
            if (str.equals("886")) {
                break;
            }
            byte[] bytes = str.getBytes();
            //3.ָ������
            InetAddress address = InetAddress.getByName("ckkk");
            int point1 = 10086;
            //4.����DatagramPacket�Ķ������ӣ�
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, point1);
            //5.����
            ds.send(dp);
        }
        //6.�ͷ���Դ
        ds.close();

    }
}
