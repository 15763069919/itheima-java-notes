package practise.ListAndMap.Map.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class demo1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> ts1 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        ts1.put(001,"英语书");
        ts1.put(002,"数学书");
        ts1.put(003,"语文书");
        ts1.put(004,"物理书");

        System.out.println(ts1);

        TreeMap<Integer,String> ts2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        ts2.put(001,"英语书");
        ts2.put(002,"数学书");
        ts2.put(003,"语文书");
        ts2.put(004,"物理书");

        System.out.println(ts2);



    }
}
