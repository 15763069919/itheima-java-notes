package practise.ListAndMap.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 存储字符串并遍历 {
    public static void main(String[] args) {
        //1.利用多态的方式创建Set接口实现类的对象
        Set<String> s = new HashSet<>();

        //2.添加元素，Set集合返回值有意义（因为Set集合不允许重复，可能导致添加元素失败）
//        boolean r1 = s.add("张三");
//        boolean r2 = s.add("张三");
        s.add("张三");
        s.add("李四");
        s.add("王五");

//        System.out.println(r1);
//        System.out.println(r2);
//        System.out.println(s);

        //4.没有索引

        //3.打印集合 -- 无序
        System.out.println(s);

        //迭代器
        System.out.println("=============Iterator===============");
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        //增强for
        System.out.println("=============增强for循环===============");
        for(String result : s){
            System.out.println(result);
        }

        //lambda表达式
        System.out.println("===============lambda=================");
        s.forEach(System.out::println);

    }
}
