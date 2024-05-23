package practise.ListAndMap.Collection.Set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class demo1 {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(2);
        t.add(1);
        t.add(3);

        //默认自动排序 -- 小->大
        System.out.println(t);

        //遍历
        //迭代器
        System.out.println("=======迭代器==========");
        Iterator<Integer> iterator = t.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }

        System.out.println("=======增强for==========");
        for(Integer r : t){
            System.out.println(r);
        }

        System.out.println("=======lambda==========");
        t.forEach(System.out::println);


    }
}
