package practise.networkProgram.UDP.SendMessage;

import java.io.IOException;
import java.net.*;

public class demo {
    public static void main(String[] args) throws IOException {
        //��������

        //1.����DatagramSocket���� -- ��ݹ�˾
        //ϸ�ڣ����� -- �󶨶˿�     �ղ� -- ���п��ö˿������ָ��һ������ʹ��
        DatagramSocket ds = new DatagramSocket();

        //2.�������
        String str = "�������������";
        byte[] bytes = str.getBytes();
        //ָ������
        InetAddress address = InetAddress.getByName("ckkk");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

        //3.��������
        ds.send(dp);

        //4.�ͷ���Դ
        ds.close();

    }
}
