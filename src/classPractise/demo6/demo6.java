package classPractise.demo6;

public class demo6 {

    public static void main(String args[]) {

//        f();            // ��4��

    }

}

class A {
    static int m;

    static void f() {
        m = 20;          //��1��
    }
}

class B extends A {
//    void f()                 //��2��
    {
        m = 222;         //��3��
    }
}