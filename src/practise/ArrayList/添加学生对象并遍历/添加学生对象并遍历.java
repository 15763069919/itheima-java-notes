package practise.ArrayList.���ѧ�����󲢱���;

import java.util.ArrayList;

public class ���ѧ�����󲢱��� {
    public static void main(String[] args) {
        //1.��������
        ArrayList<Student> list = new ArrayList<>();

        //2.����ѧ������
        Student s1 = new Student("����", 23);
        Student s2 = new Student("����", 24);
        Student s3 = new Student("����", 25);

        //3.���Ԫ��
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //4.��������
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+","+list.get(i).getAge());
        }
    }
}
