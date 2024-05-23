package practise.Thread.ProducersAndConsumers;

public class demo1 {
    public static void main(String[] args) {
        //创建线程对象
        Cook c = new Cook();
        Foodie f = new Foodie();
        c.setName("厨师");
        f.setName("吃货");
        c.start();
        f.start();


    }
}
