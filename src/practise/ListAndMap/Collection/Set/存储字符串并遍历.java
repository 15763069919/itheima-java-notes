package practise.ListAndMap.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class �洢�ַ��������� {
    public static void main(String[] args) {
        //1.���ö�̬�ķ�ʽ����Set�ӿ�ʵ����Ķ���
        Set<String> s = new HashSet<>();

        //2.���Ԫ�أ�Set���Ϸ���ֵ�����壨��ΪSet���ϲ������ظ������ܵ������Ԫ��ʧ�ܣ�
//        boolean r1 = s.add("����");
//        boolean r2 = s.add("����");
        s.add("����");
        s.add("����");
        s.add("����");

//        System.out.println(r1);
//        System.out.println(r2);
//        System.out.println(s);

        //4.û������

        //3.��ӡ���� -- ����
        System.out.println(s);

        //������
        System.out.println("=============Iterator===============");
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        //��ǿfor
        System.out.println("=============��ǿforѭ��===============");
        for(String result : s){
            System.out.println(result);
        }

        //lambda���ʽ
        System.out.println("===============lambda=================");
        s.forEach(System.out::println);

    }
}
