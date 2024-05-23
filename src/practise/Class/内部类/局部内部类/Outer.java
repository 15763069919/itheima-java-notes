package practise.Class.内部类.局部内部类;

public class Outer {
        int b = 20;
    public void show(){
        int a = 10;
        class Inner{
            String name;
            int age;
            public void method1(){
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部类中的method1非静态方法");
            }
            static public void method2() {
                System.out.println("局部类中的method1静态方法");
            }
        }
        System.out.println(new Inner().name);
        System.out.println(new Inner().age);
        new Inner().method1();
        Inner.method2();
    }
}
