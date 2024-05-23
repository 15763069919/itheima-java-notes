package practise.networkProgram.UDP.CommunicationMode;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class broadcastReceive {
    public static void main(String[] args) throws IOException {
        //����MulticastSocket����
        MulticastSocket ms = new MulticastSocket(1000);

        //����ǰ������ӵ�224.0.0.1����һ����
        InetAddress address = InetAddress.getByName("224.0.0.1");
        ms.joinGroup(address);

        //����DatagramPocket����
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        //����
        ms.receive(dp);
        //����
        InetAddress name = dp.getAddress();
        byte[] data = dp.getData();
        int length = dp.getLength();
        int port = dp.getPort();
        System.out.println(new String(data, 0, length) + "\t\t(ip��" + name + "  �˿ڣ�" + port + ")");

        //�ͷ���Դ
        ms.close();

    }
}
