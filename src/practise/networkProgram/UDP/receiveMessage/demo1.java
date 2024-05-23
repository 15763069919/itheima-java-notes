package practise.networkProgram.UDP.receiveMessage;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class demo1 {
    public static void main(String[] args) throws IOException {
        //��������

        //1.����DatagramSocket���󣨿�ݹ�˾��
        //�ڽ��յ�ʱ��һ��Ҫ�󶨶˿ڡ�����Ҫ�ͷ��͵Ķ˿ڱ���һ��
        DatagramSocket ds = new DatagramSocket(10086);
       //2. �������ݰ�
        byte[] bytes = new byte[1024];
        //����DatagramPacket�������ӣ�
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        //�÷�����������
        //����ִ�е���һ���ǵ�ʱ�򣬻����������ȣ��ȷ��Ͷ˷�����Ϣ
        ds.receive(dp);
        //3.�������ݰ�
        byte[] data = dp.getData();
        int length = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();

        System.out.println("���յ�����"+new String(data,0,length));
        System.out.println("�������Ǵ�"+address+"��̨�����е�"+port+"�˿ڷ�����");

        //4.�ͷ���Դ
        ds.close();
    }
}
