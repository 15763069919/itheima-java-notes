package practise.Stream��;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("���޼�");
        list.add("������");
        list.add("����");
        list.add("��ǿ");
        list.add("������");

        //��һ������д
/*
        //1.�������ſ�ͷ��Ԫ�ش����¼�����
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("��")) {
                list1.add(s);
            }
        }

        System.out.println(list1);

        //2.�������ſ�ͷ�ҳ���Ϊ3��Ԫ�ش����¼�����
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if( s.length() == 3 ){
                list2.add(s);
            }
        }
        System.out.println(list2);*/


        //������stream��
        list.stream().filter(name->name.startsWith("��")).filter(name->name.length() == 3).forEach(name-> System.out.println(name));
    }

}
