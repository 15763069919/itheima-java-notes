package classPractise.demo9;

public class demo9 {
        public static void main(String args[]) {
            B b = new B();
            System.out.println(b.f(10.0,8.0));	//【代码1】
            System.out.println(b.g(3));    //【代码2】

            A a = new B();
            System.out.println(a.f(10.0,8.0)); //【代码3】
            System.out.println(a.g(3));    //【代码4】
    }
}
class A {
    double f(double x,double y) {   //10.0  8.0
        return x+y; //18.0
    }
    static int g(int n) {   //3
        return n*n;     //9
    }
}
class B extends A {
    @Override
    double f(double x,double y) {   //10.0  8.0
        double m = super.f(x,y);    //18.0
        return m+x*y;   //18.0+80=98.0
    }
    static int g(int n) {   //3
        int m = A.g(n); //9
        return m+n; //12
    }
}
