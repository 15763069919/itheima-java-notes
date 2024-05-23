package classPractise.demo7;

public class demo7 {
    public static void main(String args[]) {

        B b = new B();

        System.out.println(b.f(3, 5));   //¡¾´úÂë1¡¿

        System.out.println(b.f(3.0, 5.0)); //¡¾´úÂë2¡¿
    }
}

class A {
    double f(double x, double y) {
        return x + y;
    }
}

class B extends A {
    double f(int x, int y) {
        return x * y;
    }
}