package practise.ListAndMap.Collection.Set.TreeSet.demo2;

import java.util.TreeSet;

public class demo2 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);

        TreeSet<Student> ts = new TreeSet<>();
        System.out.println(ts.add(s1));
        System.out.println(ts.add(s2));
        System.out.println(ts.add(s3));

        System.out.println(ts);
    }
}
