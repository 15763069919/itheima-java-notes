package practise.ListAndMap.Map.Map集合遍历;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 键值对 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("尹志平", "小龙女");
        m.put("郭靖", "穆念慈");
        m.put("欧阳克", "黄蓉");

        Set<Map.Entry<String, String>> entries = m.entrySet();
        //遍历Set集合，获取每个entry对象
        System.out.println("=========for==========");
        for(Map.Entry<String,String> entry : entries){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key +"=" + value);
        }

        System.out.println("=========Iterator==========");
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key +"=" + value);
        }

        System.out.println("=========lambda==========");
        entries.forEach((Map.Entry<String, String> stringStringEntry)-> {
                String key = stringStringEntry.getKey();
                String value = stringStringEntry.getValue();
                System.out.println(key +"=" + value);

        });

    }
}
