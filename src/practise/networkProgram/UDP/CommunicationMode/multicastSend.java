package practise.networkProgram.UDP.CommunicationMode;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class multicastSend {
    public static void main(String[] args) throws IOException {
        /*
        * �鲥�ķ��Ͷ˴���
        * */

        //����MulticastSocket�����鲥������ݹ�˾��
        MulticastSocket ms = new MulticastSocket();//�޲α�ʾ����˿ڷ��ͳ���
        //����DatagramPacket�������ӣ�
        String s = "������";
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("224.0.0.1");//IP��ָ���鲥ip
        int point = 1000;

        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,point);

        //����
        ms.send(dp);
        //�ͷ���Դ
        ms.close();

    }
}
