package practise.Class.�ڲ���.��Ա�ڲ���;

public class Test {
    public static void main(String[] args) {
        Outer o = new Outer();
    //Outer.Inner oi = o.getInner();//err
        //��̬
        Object oi = o.getInner();
        System.out.println(o.getInner());

    }
}
