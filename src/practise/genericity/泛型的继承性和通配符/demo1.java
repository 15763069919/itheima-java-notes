package practise.genericity.泛型的继承性和通配符;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        method(list1);
//        method(list2);
//        method(list3);
    }
    // 前面不是说：指定泛型的具体类型后，传递数据时，可以传入该类类型或者其子类类型，
    public static void method(ArrayList<Ye> list){}
}

//class Ye<String>{}
//class Fu extends Ye{}
//class Zi extends Fu{}
