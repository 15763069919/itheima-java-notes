package practise.Stream流.综合练习.demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张三,23", "李四四,24", "王五,25", "赵六六,26", "郑七,27", "陈八,28");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "杨齐师,26", "孙久,23", "刘氏,24", "倪十一,25", "卓四三,27", "杨是四,28");

        list1.stream().filter(s -> s.split(",")[0].length() == 3).limit(2).forEach(System.out::println);

        System.out.println("============================================");

        list2.stream().filter(s -> s.startsWith("杨")).skip(1).forEach(System.out::println);

        System.out.println("============================================");

        Stream.concat(list1.stream(), list2.stream()).forEach(System.out::println);

        System.out.println("============================================");


       /* Stream.concat(list1.stream(), list2.stream()).map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);


                return new Actor(name, age);
            }
        }).forEach(System.out::println);*/
        Stream.concat(list1.stream(), list2.stream()).map(s->new Actor(s.split(",")[0],Integer.parseInt(s.split(",")[1]))).forEach(System.out::println);

        System.out.println("============================================");

        List<Actor> list = Stream.concat(list1.stream(), list2.stream())
                .map(s -> new Actor(s.split(",")[0], Integer
                        .parseInt(s.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(list);

    }

}
