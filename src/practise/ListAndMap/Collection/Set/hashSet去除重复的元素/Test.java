package practise.ListAndMap.Collection.Set.hashSet去除重复的元素;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        //1.创建集合存储学生对象
        HashSet<Student> s = new HashSet<>();

        //2.创建学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);

        //3.添加集合
        System.out.println(s.add(s1));
        System.out.println(s.add(s2));
        System.out.println(s.add(s3));
        //没有重写时为true，因为是根据地址值进行计算的
        //重写后是false，是根据属性值进行计算的
        System.out.println(s.add(s4));

        //4.打印集合
        System.out.println(s);






    }
}
