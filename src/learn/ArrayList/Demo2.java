package learn.ArrayList;

import java.util.ArrayList;
public class Demo2 {
    public static void main(String[] args) {
        //1.创建一个集合
        ArrayList<String> list = new ArrayList<>();

        //2.添加元素
        list.add("aaa");
        list.add("bbb.txt");
        list.add("ccc");

        System.out.println(list);

        //3.删除元素
       /* boolean result = list.remove("aaa");
        System.out.println("删除的结果：" + result);
        System.out.println(list);

        boolean result1 = list.remove("ddd");
        System.out.println("删除的结果：" + result1);
        System.out.println(list);*/

        //4.删除指定索引位置的元素
        String str = list.remove(2);
        System.out.println("被删除的元素：" + str);
        System.out.println(list);

        //5.修改指定索引位置的元素
        String result2 = list.set(1, "ddd");
        System.out.println("被修改的元素：" + result2);
        System.out.println(list);

        //6.获取指定索引位置的元素
        String s = list.get(1);
        System.out.println("获取的元素：" + s);

        //7.获取集合的长度
        int size = list.size();
        System.out.println(list);
        System.out.println("集合的长度：" + size);

        //8.遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
