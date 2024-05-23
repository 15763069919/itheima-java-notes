package practise.ListAndMap.Collection.Collection.Collection遍历;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Collection遍历 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb.txt");
        collection.add("ccc");
        collection.add("ddd");

        //1.迭代器遍历
        System.out.println("================迭代器遍历================");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();//获取元素并移动指针
            System.out.println(next);
        }

        //2.增强for循环
        System.out.println("================增强for循环================");
        for (String s : collection) {
            System.out.println(s);
        }

        //3.lambda表达式遍历
        //方法底层会自己遍历集合，依次得到每一个元素，把得到的每一个元素传递给accept方法
        System.out.println("================匿名内部类================");
        collection.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("================lambda表达式遍历================");
        collection.forEach(s ->System.out.println(s));
    }
}
