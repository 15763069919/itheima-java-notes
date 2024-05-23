package learn.Phone;

public class PhoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        Phone p = new Phone();

        //给手机赋值
        p.brand = "小米";
        p.price = 1999.98;

        //获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用手机中的方法
        p.call();
        p.playGame();

        // 如果有第二部手机该怎么办 ?
        Phone p2 = new Phone();
        p2.brand = "苹果";
        p2.price = 8999;
        System.out.println(p2.brand);
        System.out.println(p2.price);
        p2.call();
        p2.playGame();
    }
}
