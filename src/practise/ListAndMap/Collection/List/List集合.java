package practise.ListAndMap.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class List���� {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //1.add
        //ϸ�ڣ�����ӵ���������Ԫ�أ����Ԫ�������
        System.out.println("=================add=================");
        list.add(0,"aaa");
        list.add(0,"bbb.txt");
        list.add(0,"ccc");
        list.add(0,"ddd");
        System.out.println(list);

        //2.remove
        System.out.println("=================remove=================");
        String remove = list.remove(0);
        System.out.println(remove);

        //3. set
        System.out.println("=================set=================");
        String qqq = list.set(0, "qqq");
        System.out.println(qqq);
        System.out.println(list);

        //4.get
        System.out.println("=================get=================");
        String s = list.get(0);
        System.out.println(s);
    }
}
