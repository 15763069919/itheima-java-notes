package learn.ArrayList;

import java.util.ArrayList;
public class Demo2 {
    public static void main(String[] args) {
        //1.����һ������
        ArrayList<String> list = new ArrayList<>();

        //2.���Ԫ��
        list.add("aaa");
        list.add("bbb.txt");
        list.add("ccc");

        System.out.println(list);

        //3.ɾ��Ԫ��
       /* boolean result = list.remove("aaa");
        System.out.println("ɾ���Ľ����" + result);
        System.out.println(list);

        boolean result1 = list.remove("ddd");
        System.out.println("ɾ���Ľ����" + result1);
        System.out.println(list);*/

        //4.ɾ��ָ������λ�õ�Ԫ��
        String str = list.remove(2);
        System.out.println("��ɾ����Ԫ�أ�" + str);
        System.out.println(list);

        //5.�޸�ָ������λ�õ�Ԫ��
        String result2 = list.set(1, "ddd");
        System.out.println("���޸ĵ�Ԫ�أ�" + result2);
        System.out.println(list);

        //6.��ȡָ������λ�õ�Ԫ��
        String s = list.get(1);
        System.out.println("��ȡ��Ԫ�أ�" + s);

        //7.��ȡ���ϵĳ���
        int size = list.size();
        System.out.println(list);
        System.out.println("���ϵĳ��ȣ�" + size);

        //8.����
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
