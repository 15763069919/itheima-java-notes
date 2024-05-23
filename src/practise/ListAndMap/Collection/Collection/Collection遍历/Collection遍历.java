package practise.ListAndMap.Collection.Collection.Collection����;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Collection���� {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb.txt");
        collection.add("ccc");
        collection.add("ddd");

        //1.����������
        System.out.println("================����������================");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();//��ȡԪ�ز��ƶ�ָ��
            System.out.println(next);
        }

        //2.��ǿforѭ��
        System.out.println("================��ǿforѭ��================");
        for (String s : collection) {
            System.out.println(s);
        }

        //3.lambda���ʽ����
        //�����ײ���Լ��������ϣ����εõ�ÿһ��Ԫ�أ��ѵõ���ÿһ��Ԫ�ش��ݸ�accept����
        System.out.println("================�����ڲ���================");
        collection.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("================lambda���ʽ����================");
        collection.forEach(s ->System.out.println(s));
    }
}
