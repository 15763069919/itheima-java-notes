package practise.Class.包装类.创建对象;

public class Demo1 {
    public static void main(String[] args) {

        //JDK5以前
        //1.利用构造方法获取Integer对象
        Integer i1 = new Integer(1);
        Integer i2 = new Integer("1");
        System.out.println(i1);
        System.out.println(i2);

        //2.利用静态方法获取Integer的对象
        Integer i3 = Integer.valueOf(1);
        Integer i4 = Integer.valueOf("1");
        System.out.println(i3);
        System.out.println(i4);

        //3.这两种获取对象方式的区别
        //细节：在底层会提前创建-128~127的对象，以节省内存
        Integer i5 = Integer.valueOf(127);
        Integer i6 = Integer.valueOf(127);
        System.out.println(i5 == i6);   //true

        Integer i7 = Integer.valueOf(128);
        Integer i8 = Integer.valueOf(128);
        System.out.println(i7 == i8);   //false

        Integer i9 = new Integer(127);
        Integer i10 = new Integer(127);
        System.out.println(i9 == i10);  //false

        Integer i11 = new Integer(128);
        Integer i12 = new Integer(128);
        System.out.println(i11 == i12); //false
    }
}
