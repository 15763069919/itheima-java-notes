package learn.This;

public class thisʹ�þ��� {
    private int age;//0

    public void method1(){
        int age = 10;
        System.out.println(age);//10(�ͽ�ԭ��)
    }
    public void method2(){
        int age = 10;
        System.out.println(this.age);//0(ʹ�ó�Ա����)
    }
    public void method3(){
        System.out.println(this.age);//0(ֻ��ʹ�ó�Ա����)
    }

}

