package practise.ListAndMap.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List遍历 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb.txt");
        list.add("ccc");
        list.add("ddd");

        //1.迭代器
        System.out.println("===============迭代器================");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        //2.增强for
        System.out.println("===============增强for================");
        for(String s : list){
            System.out.println(s);
        }

        //3.lambda
        System.out.println("===============lambda================");
        list.forEach(System.out::println);

        //4.for
        System.out.println("===============for================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //5.列表迭代器
        System.out.println("===============列表迭代器================");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            System.out.println(next);
            if("bbb.txt".equals(next)){
                listIterator.add("qqq");
            }
        }
        System.out.println(list);
    }
}
