package practise.DynamicProxy;

public class demo1 {
    public static void main(String[] args) {
        //��ȡ����Ķ���
        BigStar bigStar = new BigStar("����");
        Star proxy = ProxyUtil.createProxy(bigStar);

        //���ó���ķ���
        String result = proxy.sing("ֻ����̫��");
        System.out.println(result);

        //��������ķ���
        proxy.dance();



    }
}
