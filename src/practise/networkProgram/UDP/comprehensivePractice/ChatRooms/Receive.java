package practise.networkProgram.UDP.comprehensivePractice.ChatRooms;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Receive {
    public static void main(String[] args) throws IOException {
        //������������
        //1.����DatagramSocket���󣨿�ݹ�˾��,ָ�����ն˿�
        DatagramSocket ds = new DatagramSocket(10086);
        //2.�������ݰ�
        byte[] bytes2 = new byte[1024];
        //����DatagramPacket�������ӣ�
        DatagramPacket dp = new DatagramPacket(bytes2, bytes2.length);
        while (true) {
            //����
            ds.receive(dp);
            //3.�������ݰ�
            byte[] data = dp.getData();
            int length = dp.getLength();
            InetAddress address = dp.getAddress();
            int port = dp.getPort();

            System.out.print(new String(data, 0, length));
            System.out.println("\t\t(���� ip��" + address +" �˿ڣ�"+ port + ")");
        }
    }
}
