package practise.ListAndMap.Map.Map���ϱ���;

import java.util.HashMap;
import java.util.Map;

public class lambda���ʽ���� {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("��־ƽ", "С��Ů");
        m.put("����", "�����");
        m.put("ŷ����", "����");

        m.forEach((s, s2) ->System.out.println(s + "=" + s2));


    }
}
