package practise.ListAndMap.Map.Map集合遍历;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class 键找值 {
    public static void main(String[] args) {

        Map<String, String> m = new HashMap<>();

        m.put("尹志平", "小龙女");
        m.put("郭靖", "穆念慈");
        m.put("欧阳克", "黄蓉");

        //通过键找值
        //把key放在一个map中
        Set<String> keys = m.keySet();
        System.out.println(keys);

        //遍历单列集合得到每一个键

        System.out.println("==============增强for===============");
        for (String key : keys) {
//            System.out.println(key);
            //利用键获取对应的值
            String s = m.get(key);
            System.out.println(key + "=" + s);
        }

        System.out.println("==============iterator===============");

        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next + "=" + m.get(next));
        }

        System.out.println("==============lambda===============");
        keys.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + "=" + m.get(s));
            }
        });


    }
}
