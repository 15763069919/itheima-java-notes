package practise.networkProgram.UDP.CommunicationMode;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class cleanCultureReceive {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象（快递公司）
        DatagramSocket ds = new DatagramSocket(10086);
        //创建DatagramPocket对象（箱子）
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        while(true){
            //接收数据包
            ds.receive(dp);
            //解析数据包
            InetAddress address = dp.getAddress();
            int length = dp.getLength();
            byte[] data = dp.getData();
            int port = dp.getPort();
            System.out.println(new String(data,0,length)+"\t\t(ip："+address+" 端口："+port+")");
        }
    }
}
