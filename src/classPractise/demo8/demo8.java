package classPractise.demo8;

public class demo8 {
    public static void main(String args[]) {

        A a = new A();

        System.out.println(a.getNumber(10)); //������1��

        a = new B();

        System.out.println(a.getNumber(10)); //������2��
    }
}

class A {
    public int getNumber(int a) {
        return a + 1;
    }
}

class B extends A {
    public int getNumber(int a) {
        return a + 100;
    }
}
