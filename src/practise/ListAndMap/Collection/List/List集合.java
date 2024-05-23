package practise.ListAndMap.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class List集合 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //1.add
        //细节：若添加的索引处有元素，则该元素向后移
        System.out.println("=================add=================");
        list.add(0,"aaa");
        list.add(0,"bbb.txt");
        list.add(0,"ccc");
        list.add(0,"ddd");
        System.out.println(list);

        //2.remove
        System.out.println("=================remove=================");
        String remove = list.remove(0);
        System.out.println(remove);

        //3. set
        System.out.println("=================set=================");
        String qqq = list.set(0, "qqq");
        System.out.println(qqq);
        System.out.println(list);

        //4.get
        System.out.println("=================get=================");
        String s = list.get(0);
        System.out.println(s);
    }
}
