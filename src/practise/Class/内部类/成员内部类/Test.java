package practise.Class.内部类.成员内部类;

public class Test {
    public static void main(String[] args) {
        Outer o = new Outer();
    //Outer.Inner oi = o.getInner();//err
        //多态
        Object oi = o.getInner();
        System.out.println(o.getInner());

    }
}
