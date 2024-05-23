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
        ts1.put(001,"Ӣ����");
        ts1.put(002,"��ѧ��");
        ts1.put(003,"������");
        ts1.put(004,"������");

        System.out.println(ts1);

        TreeMap<Integer,String> ts2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        ts2.put(001,"Ӣ����");
        ts2.put(002,"��ѧ��");
        ts2.put(003,"������");
        ts2.put(004,"������");

        System.out.println(ts2);



    }
}
