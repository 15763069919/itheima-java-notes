package practise.networkProgram.UDP.CommunicationMode;

import java.io.IOException;
import java.net.*;

public class cleanCultureSend {
    public static void main(String[] args) throws IOException {
        /*
         * 单播发送端
         * */
        //创建DatagramOSocket对象（快递公司）
        DatagramSocket ds = new DatagramSocket();//无参表示从随机端口发送出来
        //创建DatagramPacket对象（箱子）并填入参数
        String s = "你好你好";
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("ckkk");
        int point = 10086;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, point);
        //发送
        ds.send(dp);
        //释放资源
        ds.close();
    }
}
