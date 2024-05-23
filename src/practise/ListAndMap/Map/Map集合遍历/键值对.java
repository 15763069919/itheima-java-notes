package practise.ListAndMap.Map.Map���ϱ���;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ��ֵ�� {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("��־ƽ", "С��Ů");
        m.put("����", "�����");
        m.put("ŷ����", "����");

        Set<Map.Entry<String, String>> entries = m.entrySet();
        //����Set���ϣ���ȡÿ��entry����
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
