package practise.ArrayList;

import practise.ArrayList.���ѧ�����󲢱���.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ����¼��ѧ������ {
    public static void main(String[] args) {
        //�������϶���
        ArrayList<Student> list = new ArrayList<>();
        //����¼��
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("������ѧ��������");
            Student s = new Student();
            s.setName(sc.nextLine());
            System.out.println("������ѧ�����䣺");
            s.setAge(sc.nextInt());
            //��ѧ������ֵ������
            list.add(s);
        }

        //��������
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + "," + list.get(i).getAge());
        }

    }
}