package practise.ListAndMap.不可变集合;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class demo1 {
    public static void main(String[] args) {
        List<String> list = List.of("张三", "李四", "王五", "赵六");

//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));

//        list.remove("李四");
//        list.add("李四");


        //键不能重复
        Set<String> set = Set.of("张三",/*"张三",*/ "李四", "王五", "赵六");

        System.out.println(set);

//        set.remove("李四");
//        set.add("李四");


        Map<String, String> map = Map.of("张三", "北京", "李四", "深圳","王五", "深圳", "赵六", "山东");

        System.out.println(map);


        HashMap<String,String> hm = new HashMap<>();
        hm.put("张三","北京");
        hm.put("李四", "深圳");
        hm.put( "王五", "深圳");
        hm.put("赵六", "山东");


        Map<Object, Object> objectObjectMap = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
        map.put("张三","深圳");
    }
}
