package practise.ListAndMap.Collection.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection���м��� {
    public static void main(String[] args) {

        //Collection��һ���ӿڣ����ǲ���ֱ�Ӵ������Ķ���ֻ�ܴ�����ʵ����Ķ���Ϊ��ѧϰ����

        //����ʹ����ʵ����ArrayList��ʾ
        Collection<String> collection = new ArrayList<>();

        //1.��������
        //����ֵ��
        //  ��Listϵ�������Զ����ture
        //  ��Setϵ����ӣ������Ԫ�ز���Set������ڣ�����ture�������ʾԪ���Ѿ����ڡ�����false
        //  ��ΪSetϵ�в������ظ�
        collection.add("aaa");
        collection.add("bbb.txt");
        collection.add("ccc");

        System.out.println("1."+collection);

        //2.���
        collection.clear();
        System.out.println("2."+collection);

        //3.ɾ��
        //��Ϊ��Collection�������List��Set�Ĺ��Եķ���
        // ��Setϵ��û������������Collection��remove��������ͨ������ɾ��
        //���磺������Ŀ remove(1) �� remove(new Integer(1)) ����
        //  ǰ��Ϊ������ɾ��������Ϊɾ������
        collection.add("aaa");
        collection.add("bbb.txt");
        collection.add("ccc");
        System.out.println("3.1"+collection);
        collection.remove("aaa");
        System.out.println("3.2ɾ��aaa:"+collection);

        //4.�ж�Ԫ���Ƿ����
        //�ӿ��ж���ķ����ǳ��󷽷�����Ҫ��д
        //�ײ㣺����Object��equals���������жϵ�
        //��������д洢�����Զ������Ҳ��ͨ��contains�������ж��Ƿ������һ��Ҫ��дequals����
        //��Ϊequals�Ƚϵ��ǵ�ֵַ����ʹ�����е�����ֵһ��
        boolean ddd = collection.contains("ddd");
        System.out.println(ddd);

        //5.�ж��Ƿ�Ϊ��isEmpty()
        //6.��ȡ���ϳ���size()
    }
}
