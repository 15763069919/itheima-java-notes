package practise.networkProgram.InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class demo1 {
    public static void main(String[] args) throws UnknownHostException {
        //1.getByName(String host)��ȡInetAddress�Ķ���
        //IP�Ķ��� -- ���ԵĶ���
        InetAddress address = InetAddress.getByName("ckkk");   //MoXin -> //10.242.196.57
        System.out.println(address);    //ckkk ->//10.242.195.232

        //��ȡ��������
        String name = address.getHostName();
        System.out.println(name);

        //��ȡ����ip
        String ip = address.getHostAddress();
        System.out.println(ip);
        //2.
    }
}
