package practise.networkProgram.UDP.CommunicationMode;

import java.io.IOException;
import java.net.*;

public class cleanCultureSend {
    public static void main(String[] args) throws IOException {
        /*
         * �������Ͷ�
         * */
        //����DatagramOSocket���󣨿�ݹ�˾��
        DatagramSocket ds = new DatagramSocket();//�޲α�ʾ������˿ڷ��ͳ���
        //����DatagramPacket�������ӣ����������
        String s = "������";
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("ckkk");
        int point = 10086;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, point);
        //����
        ds.send(dp);
        //�ͷ���Դ
        ds.close();
    }
}
