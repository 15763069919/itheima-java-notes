package practise.ListAndMap.Collection.Set.LinkedHashSet;

import practise.ListAndMap.Collection.Set.哈希表.哈希值.Student;

import java.util.LinkedHashSet;

public class demo1 {
    public static void main(String[] args) {
        //1.创建学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);

        //2.创建集合的对象
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        //3.添加元素
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));

        //4.打印集合
        System.out.println(lhs);
    }
}
