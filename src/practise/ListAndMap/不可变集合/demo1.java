package practise.ListAndMap.���ɱ伯��;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class demo1 {
    public static void main(String[] args) {
        List<String> list = List.of("����", "����", "����", "����");

//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));

//        list.remove("����");
//        list.add("����");


        //�������ظ�
        Set<String> set = Set.of("����",/*"����",*/ "����", "����", "����");

        System.out.println(set);

//        set.remove("����");
//        set.add("����");


        Map<String, String> map = Map.of("����", "����", "����", "����","����", "����", "����", "ɽ��");

        System.out.println(map);


        HashMap<String,String> hm = new HashMap<>();
        hm.put("����","����");
        hm.put("����", "����");
        hm.put( "����", "����");
        hm.put("����", "ɽ��");


        Map<Object, Object> objectObjectMap = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
        map.put("����","����");
    }
}
