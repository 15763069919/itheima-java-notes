package practise.methodCite.引用静态方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");

        //lambda
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {

                return Integer.parseInt(s);
            }
        }).forEach(System.out::println);

        System.out.println("===============================");

        //方法引用
        list.stream().map(Integer::parseInt).forEach(System.out::println);

    }
}

