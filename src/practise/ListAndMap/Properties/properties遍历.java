package practise.ListAndMap.Properties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class properties���� {
    public static void main(String[] args) {
        //1. �������϶���
        Properties p = new Properties();
        //2. �������
        //һ������ַ�������Ȼ��û�з���
        p.put("aaa","bbb");
        p.put("bbb","bbb");
        p.put("ccc","bbb");
        p.put("ddd","bbb");
        System.out.println(p);
        //3.��������
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
