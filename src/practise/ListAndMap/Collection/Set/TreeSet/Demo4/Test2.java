package practise.ListAndMap.Collection.Set.TreeSet.Demo4;

import java.util.Comparator;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("zhangsan",23,80,80,80);
        Student2 s2 = new Student2("lisi",24,40,50,60);
        Student2 s3 = new Student2("wangwu",25,99,99,99);
        Student2 s4 = new Student2("zhaoliu",26,56,35,66);
        Student2 s5 = new Student2("zhengqi",27,84,67,25);

        TreeSet<Student2> ts = new TreeSet<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                double v = o2.getChinese() + o2.getEnglish() + o2.getMath() - (o1.getChinese() + o1.getEnglish() + o1.getMath());
                v = v == 0 ? o2.getChinese() - o1.getChinese() : v;
                v = v == 0 ? o2.getMath() - o1.getMath() : v;
                v = v == 0 ? o2.getEnglish() - o1.getEnglish() : v;
                v = v == 0 ? 0: v;

                if(v > 0 ) v = 1;
                else if(v < 0 )v = -1;
                else v = 0;
                return (int)v;
            }
        });

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        System.out.println(ts);

    }
}
