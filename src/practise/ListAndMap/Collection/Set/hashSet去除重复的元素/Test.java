package practise.ListAndMap.Collection.Set.hashSetȥ���ظ���Ԫ��;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        //1.�������ϴ洢ѧ������
        HashSet<Student> s = new HashSet<>();

        //2.����ѧ������
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);

        //3.��Ӽ���
        System.out.println(s.add(s1));
        System.out.println(s.add(s2));
        System.out.println(s.add(s3));
        //û����дʱΪtrue����Ϊ�Ǹ��ݵ�ֵַ���м����
        //��д����false���Ǹ�������ֵ���м����
        System.out.println(s.add(s4));

        //4.��ӡ����
        System.out.println(s);






    }
}
