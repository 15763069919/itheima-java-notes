package practise.ListAndMap.Map.Map集合遍历;

import java.util.HashMap;
import java.util.Map;

public class lambda表达式遍历 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("尹志平", "小龙女");
        m.put("郭靖", "穆念慈");
        m.put("欧阳克", "黄蓉");

        m.forEach((s, s2) ->System.out.println(s + "=" + s2));


    }
}
