package practise.Class.内部类.成员内部类例题1;

public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}
