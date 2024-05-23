package practise.ListAndMap.Map.LinkedHashMap;

import java.util.LinkedHashMap;

public class demo1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a",123);
        linkedHashMap.put("a",123);
        linkedHashMap.put("directory",456);

        System.out.println(linkedHashMap);
    }
}
