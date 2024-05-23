package practise.Class.内部类.静态内部类;

public class Test {

    public static void main(String[] args) {
        //需要创建Inner的对象来访问
        new Outer.Inner().show1();
        //static可不创建对象访问
        Outer.Inner.show2();
    }
}
