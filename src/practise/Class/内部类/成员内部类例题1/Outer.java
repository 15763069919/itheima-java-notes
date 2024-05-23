package practise.Class.内部类.成员内部类例题1;

public class Outer {
    private int a = 10;//外部类的成员变量

    class Inner{
        private int a = 20;//成员变量
        public void show(){
            int a = 30;//局部变量
            System.out.println(Outer.this.a);//10
            System.out.println(this.a);//20
            System.out.println(a);//30
        }
    }
}
