package practise.ListAndMap.Properties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class properties遍历 {
    public static void main(String[] args) {
        //1. 创建集合对象
        Properties p = new Properties();
        //2. 添加数据
        //一般添加字符串，虽然其没有泛型
        p.put("aaa","bbb");
        p.put("bbb","bbb");
        p.put("ccc","bbb");
        p.put("ddd","bbb");
        System.out.println(p);
        //3.遍历集合
        Set<Object> keys = p.keySet();
        for (Object key : keys) {
            Object value = p.get(key);
            System.out.println(key +"=" + value);
        }
        System.out.println("================");
        Set<Map.Entry<Object, Object>> entries = p.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }


    }
}
