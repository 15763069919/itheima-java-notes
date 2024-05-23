package learn.This;

public class this使用举例 {
    private int age;//0

    public void method1(){
        int age = 10;
        System.out.println(age);//10(就近原则)
    }
    public void method2(){
        int age = 10;
        System.out.println(this.age);//0(使用成员变量)
    }
    public void method3(){
        System.out.println(this.age);//0(只能使用成员变量)
    }

}

