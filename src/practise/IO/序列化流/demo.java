package practise.IO.���л���;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student("zhangsan",23,"�Ͼ�");
        Student s2 = new Student("lis",24,"����");
        Student s3 = new Student("wangwu",25,"����");

        /*
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lib/txt/student.txt"));
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);

        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lib/txt/student.txt"));
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());*/



        //δ֪������� -- ���뼯��Ȼ��Լ��Ͻ������л������ļ�
        //���л�
        //�������л�����
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lib/txt/student.txt"));
        //��������
        ArrayList<Student> list = new ArrayList<>();
        //���뼯��
        Collections.addAll(list,s1,s2,s3);
        //���л�����
        oos.writeObject(list);

        //�����л�
        //���������л�����
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lib/txt/student.txt"));
        list = (ArrayList<Student>) ois.readObject();
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
