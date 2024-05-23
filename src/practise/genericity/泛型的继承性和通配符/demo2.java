package practise.genericity.泛型的继承性和通配符;

import java.util.ArrayList;

public class demo2 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();
        ArrayList<Student> list4 = new ArrayList<>();   //ok

        method1(list1);
        method1(list2);
        method1(list3);
//        method1(list4);  //err

        method2(list1);
        method2(list2);
        method2(list3);
//        method2(list4);  //err
    }
    public static void method1(ArrayList<? extends Ye> list){

    }
    public static void method2(ArrayList<? super Zi> list){

    }
}
class Ye<String>{}
class Fu extends Ye{}
class Zi extends Fu{}
class Student{};