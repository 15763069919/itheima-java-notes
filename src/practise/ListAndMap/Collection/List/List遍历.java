package practise.ListAndMap.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List���� {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb.txt");
        list.add("ccc");
        list.add("ddd");

        //1.������
        System.out.println("===============������================");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        //2.��ǿfor
        System.out.println("===============��ǿfor================");
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

        //5.�б������
        System.out.println("===============�б������================");
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
