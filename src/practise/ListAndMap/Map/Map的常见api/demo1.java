package practise.ListAndMap.Map.Map�ĳ���api;

import java.util.HashMap;
import java.util.Map;

public class demo1 {
    public static void main(String[] args) {
        //1.����Map���ϵĶ���
        Map<String, String> m = new HashMap<>();

        //2.���Ԫ��
        System.out.println("=========put===========");

        String put1 = m.put("����", "����");
        System.out.println(put1);   //null
        String put2 = m.put("ΤС��", "�彣��");
        System.out.println(put2);   //null
        String put3 = m.put("��־ƽ", "С��Ů");
        System.out.println(put3);   //null

        //���ǲ����ر����ǵ�ֵ
        String put4 = m.put("ΤС��", "˫��");
        System.out.println(put4);   //�彣��

        //3.��ӡ����
        System.out.println(m);  //{ΤС��=˫��, ��־ƽ=С��Ů, ����=����}


        //4.ɾ��
        System.out.println("=========remove===========");

        System.out.println(m);
        String remove = m.remove("����");
        System.out.println(remove);
        System.out.println(m);

        //5.���
//        m.clear();

        //6.�ж��Ƿ������
        System.out.println("=========containsKey===========");

        boolean result1 = m.containsKey("ΤС��");
        System.out.println(result1);    //true
        boolean result2 = m.containsKey("ΤС��2");
        System.out.println(result2);    //false

        //6.�ж��Ƿ����ֵ
        System.out.println("=========containsValue===========");

        boolean result3 = m.containsValue("С��Ů");
        System.out.println(result3);    //true
        boolean result4 = m.containsValue("С��Ů2");
        System.out.println(result4);    //false

        //7.�ж��Ƿ�Ϊ��
        System.out.println("=========isEmpty===========");
        boolean empty = m.isEmpty();
        System.out.println(empty);  //false

        //8.��ȡ����
        System.out.println("=========size===========");
        int size = m.size();
        System.out.println(size);   //2

    }
}
