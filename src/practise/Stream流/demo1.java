package practise.Stream流;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //法一：正常写
/*
        //1.把所以张开头的元素存入新集合中
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                list1.add(s);
            }
        }

        System.out.println(list1);

        //2.把所以张开头且长度为3的元素存入新集合中
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if( s.length() == 3 ){
                list2.add(s);
            }
        }
        System.out.println(list2);*/


        //法二：stream流
        list.stream().filter(name->name.startsWith("张")).filter(name->name.length() == 3).forEach(name-> System.out.println(name));
    }

}
