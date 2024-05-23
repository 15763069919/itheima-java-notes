package practise.networkProgram.UDP.comprehensivePractice.ChatRooms;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Receive {
    public static void main(String[] args) throws IOException {
        //二、接收数据
        //1.创建DatagramSocket对象（快递公司）,指定接收端口
        DatagramSocket ds = new DatagramSocket(10086);
        //2.接收数据包
        byte[] bytes2 = new byte[1024];
        //创建DatagramPacket对象（箱子）
        DatagramPacket dp = new DatagramPacket(bytes2, bytes2.length);
        while (true) {
            //接收
            ds.receive(dp);
            //3.解析数据包
            byte[] data = dp.getData();
            int length = dp.getLength();
            InetAddress address = dp.getAddress();
            int port = dp.getPort();

            System.out.print(new String(data, 0, length));
            System.out.println("\t\t(来自 ip：" + address +" 端口："+ port + ")");
        }
    }
}
