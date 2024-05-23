package practise.methodCite.其他调用;

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb.txt","ccc");
        /*list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return  s.toUpperCase();
            }
        }).forEach(System.out::println);*/

        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
