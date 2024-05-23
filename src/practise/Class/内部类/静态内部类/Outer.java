package practise.Class.内部类.静态内部类;

public class Outer {
    static class Inner{
        //需要创建对象来访问
        public void show1(){
            System.out.println("非静态方法");
        }
        //可以直接用 类名.方法 来访问
        public static void show2() {
            System.out.println("静态方法");
        }
    }
}
