package practise.ListAndMap.Map.Map���ϱ���;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class ����ֵ {
    public static void main(String[] args) {

        Map<String, String> m = new HashMap<>();

        m.put("��־ƽ", "С��Ů");
        m.put("����", "�����");
        m.put("ŷ����", "����");

        //ͨ������ֵ
        //��key����һ��map��
        Set<String> keys = m.keySet();
        System.out.println(keys);

        //�������м��ϵõ�ÿһ����

        System.out.println("==============��ǿfor===============");
        for (String key : keys) {
//            System.out.println(key);
            //���ü���ȡ��Ӧ��ֵ
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
