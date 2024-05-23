package practise.ListAndMap.Collection.Set.TreeSet.Demo4;

import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("zhangsan",23,80,80,80);
        Student1 s2 = new Student1("lisi",24,40,50,60);
        Student1 s3 = new Student1("wangwu",25,99,99,99);
        Student1 s4 = new Student1("zhaoliu",26,56,35,66);
        Student1 s5 = new Student1("zhengqi",27,84,67,25);

        TreeSet<Student1> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        System.out.println(ts);

    }
}
