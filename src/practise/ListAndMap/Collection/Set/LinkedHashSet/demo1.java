package practise.ListAndMap.Collection.Set.LinkedHashSet;

import practise.ListAndMap.Collection.Set.��ϣ��.��ϣֵ.Student;

import java.util.LinkedHashSet;

public class demo1 {
    public static void main(String[] args) {
        //1.����ѧ������
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);

        //2.�������ϵĶ���
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        //3.���Ԫ��
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));

        //4.��ӡ����
        System.out.println(lhs);
    }
}
