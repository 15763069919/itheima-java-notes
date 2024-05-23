package practise.ListAndMap.Collection.Set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class demo1 {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(2);
        t.add(1);
        t.add(3);

        //Ĭ���Զ����� -- С->��
        System.out.println(t);

        //����
        //������
        System.out.println("=======������==========");
        Iterator<Integer> iterator = t.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }

        System.out.println("=======��ǿfor==========");
        for(Integer r : t){
            System.out.println(r);
        }

        System.out.println("=======lambda==========");
        t.forEach(System.out::println);


    }
}
