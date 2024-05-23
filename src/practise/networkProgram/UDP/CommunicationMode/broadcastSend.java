package practise.networkProgram.UDP.CommunicationMode;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class broadcastSend {
    public static void main(String[] args) throws IOException {
        /*
        * 组播的发送端代码
        * */

        //创建MulticastSocket对象（组播）（快递公司）
        MulticastSocket ms = new MulticastSocket();//无参表示随机端口发送出来
        //创建DatagramPacket对象（箱子）
        String s = "你好你好";
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("255.255.255.255");//IP需指定组播ip
        int point = 1000;

        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,point);

        //发送
        ms.send(dp);
        //释放资源
        ms.close();

    }
}
