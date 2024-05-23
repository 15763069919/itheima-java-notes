package classPractise.demo6;

public class demo6 {

    public static void main(String args[]) {

//        f();            // ¡¾4¡¿

    }

}

class A {
    static int m;

    static void f() {
        m = 20;          //¡¾1¡¿
    }
}

class B extends A {
//    void f()                 //¡¾2¡¿
    {
        m = 222;         //¡¾3¡¿
    }
}