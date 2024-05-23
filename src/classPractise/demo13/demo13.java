package classPractise.demo13;

public class demo13 {
    public static void main(String args[]) {
        A a = new B();
        System.out.println(a.f(3, 5)); //¡¾´úÂë1¡¿
        B b = (B) a;
        System.out.println(b.g(3, 5)); //¡¾´úÂë2¡¿
    }
}

interface A {
    double f(double x, double y);
}

class B implements A {
    public double f(double x, double y) {
        return x * y;
    }

    int g(int a, int b) {
        return a + b;
    }
}