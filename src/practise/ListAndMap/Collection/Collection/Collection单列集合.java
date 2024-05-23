package practise.ListAndMap.Collection.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection单列集合 {
    public static void main(String[] args) {

        //Collection是一个接口，我们不能直接创建他的对象，只能创建其实现类的对象，为了学习方便

        //我们使用其实现类ArrayList演示
        Collection<String> collection = new ArrayList<>();

        //1.创建对象
        //返回值：
        //  往List系列添加永远返回ture
        //  往Set系列添加，若添加元素不在Set里面存在，返回ture，否则表示元素已经存在。返回false
        //  因为Set系列不允许重复
        collection.add("aaa");
        collection.add("bbb.txt");
        collection.add("ccc");

        System.out.println("1."+collection);

        //2.清空
        collection.clear();
        System.out.println("2."+collection);

        //3.删除
        //因为在Collection定义的是List和Set的共性的方法
        // 而Set系列没有索引，所以Collection的remove方法不能通过索引删除
        //比如：面试题目 remove(1) 和 remove(new Integer(1)) 区别
        //  前者为据索引删除，后者为删除对象
        collection.add("aaa");
        collection.add("bbb.txt");
        collection.add("ccc");
        System.out.println("3.1"+collection);
        collection.remove("aaa");
        System.out.println("3.2删除aaa:"+collection);

        //4.判断元素是否包含
        //接口中定义的方法是抽象方法，需要重写
        //底层：依赖Object的equals方法进行判断的
        //如果集合中存储的是自定义对象，也想通过contains方法来判断是否包含，一定要重写equals方法
        //因为equals比较的是地址值，即使对象中的属性值一样
        boolean ddd = collection.contains("ddd");
        System.out.println(ddd);

        //5.判断是否为空isEmpty()
        //6.获取集合长度size()
    }
}
