package practise.Thread.ThreeWaysToImplementMultithreading.First_ExtendsThread;

public class demo1 {
    public static void main(String[] args) {
        /*
        *  多线程的第一种启动方式
        *       1.自己定义一个类继承Thread
        *       2.重写run方法
        *       3.创建子类的对象，并启动线程
        * */

        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();

        //给线程起个名字
        t1.setName("线程1");
        t2.setName("线程2");

        //开启线程
        t1.start();
        t2.start();
    }
}
