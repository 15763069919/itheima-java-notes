package practise.DynamicProxy;

public class demo1 {
    public static void main(String[] args) {
        //获取代理的对象
        BigStar bigStar = new BigStar("鸡哥");
        Star proxy = ProxyUtil.createProxy(bigStar);

        //调用唱歌的方法
        String result = proxy.sing("只因你太美");
        System.out.println(result);

        //调用跳舞的方法
        proxy.dance();



    }
}
