package practise.networkProgram.UDP.CommunicationMode;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class cleanCultureReceive {
    public static void main(String[] args) throws IOException {
        //����DatagramSocket���󣨿�ݹ�˾��
        DatagramSocket ds = new DatagramSocket(10086);
        //����DatagramPocket�������ӣ�
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        while(true){
            //�������ݰ�
            ds.receive(dp);
            //�������ݰ�
            InetAddress address = dp.getAddress();
            int length = dp.getLength();
            byte[] data = dp.getData();
            int port = dp.getPort();
            System.out.println(new String(data,0,length)+"\t\t(ip��"+address+" �˿ڣ�"+port+")");
        }
    }
}
