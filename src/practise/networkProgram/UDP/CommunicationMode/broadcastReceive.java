package practise.networkProgram.UDP.CommunicationMode;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class broadcastReceive {
    public static void main(String[] args) throws IOException {
        //创建MulticastSocket对象
        MulticastSocket ms = new MulticastSocket(1000);

        //将当前主机添加到224.0.0.1的这一组中
        InetAddress address = InetAddress.getByName("224.0.0.1");
        ms.joinGroup(address);

        //创建DatagramPocket对象
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        //接收
        ms.receive(dp);
        //解析
        InetAddress name = dp.getAddress();
        byte[] data = dp.getData();
        int length = dp.getLength();
        int port = dp.getPort();
        System.out.println(new String(data, 0, length) + "\t\t(ip：" + name + "  端口：" + port + ")");

        //释放资源
        ms.close();

    }
}
