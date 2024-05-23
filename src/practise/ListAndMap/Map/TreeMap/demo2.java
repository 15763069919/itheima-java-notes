package practise.ListAndMap.Map.TreeMap;

import java.util.TreeMap;

public class demo2 {
    public static void main(String[] args) {
        TreeMap<Student,String> ts = new TreeMap<>();
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhaoliu",26);


        ts.put(s1,"北京");
        ts.put(s2,"上海");
        ts.put(s3,"山东");
        ts.put(s4,"深圳");


        System.out.println(ts);






    }

}
