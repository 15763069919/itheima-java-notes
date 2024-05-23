package practise.networkProgram.UDP.SendMessage;

import java.io.IOException;
import java.net.*;

public class demo {
    public static void main(String[] args) throws IOException {
        //发送数据

        //1.创建DatagramSocket对象 -- 快递公司
        //细节：参数 -- 绑定端口     空参 -- 所有可用端口中随机指定一个进行使用
        DatagramSocket ds = new DatagramSocket();

        //2.打包数据
        String str = "你好威啊！！！";
        byte[] bytes = str.getBytes();
        //指定电脑
        InetAddress address = InetAddress.getByName("ckkk");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

        //3.发送数据
        ds.send(dp);

        //4.释放资源
        ds.close();

    }
}
