package practise.Stream��.�ۺ���ϰ.demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "����,23", "������,24", "����,25", "������,26", "֣��,27", "�°�,28");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "����ʦ,26", "���,23", "����,24", "��ʮһ,25", "׿����,27", "������,28");

        list1.stream().filter(s -> s.split(",")[0].length() == 3).limit(2).forEach(System.out::println);

        System.out.println("============================================");

        list2.stream().filter(s -> s.startsWith("��")).skip(1).forEach(System.out::println);

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
