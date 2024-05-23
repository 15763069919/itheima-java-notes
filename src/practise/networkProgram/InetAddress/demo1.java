package practise.networkProgram.InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class demo1 {
    public static void main(String[] args) throws UnknownHostException {
        //1.getByName(String host)获取InetAddress的对象
        //IP的对象 -- 电脑的对象
        InetAddress address = InetAddress.getByName("ckkk");   //MoXin -> //10.242.196.57
        System.out.println(address);    //ckkk ->//10.242.195.232

        //获取电脑名称
        String name = address.getHostName();
        System.out.println(name);

        //获取电脑ip
        String ip = address.getHostAddress();
        System.out.println(ip);
        //2.
    }
}
