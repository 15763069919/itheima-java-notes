package practise.ListAndMap.Map.TreeMap;

import java.util.TreeMap;

public class demo2 {
    public static void main(String[] args) {
        TreeMap<Student,String> ts = new TreeMap<>();
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhaoliu",26);


        ts.put(s1,"����");
        ts.put(s2,"�Ϻ�");
        ts.put(s3,"ɽ��");
        ts.put(s4,"����");


        System.out.println(ts);






    }

}
