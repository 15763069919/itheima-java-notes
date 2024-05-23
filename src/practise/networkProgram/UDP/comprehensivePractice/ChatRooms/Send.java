package practise.networkProgram.UDP.comprehensivePractice.ChatRooms;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Send {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        //1.创建DatagramPacket对象（快递公司）,使用随机端口发送
        DatagramSocket ds = new DatagramSocket();
        while (true) {
            //一、发送数据
            //2.打包数据（获取数据的字节数组）
            System.out.println("输入：");
            String str = sc.nextLine();
            if (str.equals("886")) {
                break;
            }
            byte[] bytes = str.getBytes();
            //3.指定电脑
            InetAddress address = InetAddress.getByName("ckkk");
            int point1 = 10086;
            //4.创建DatagramPacket的对象（箱子）
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, point1);
            //5.发送
            ds.send(dp);
        }
        //6.释放资源
        ds.close();

    }
}
