package practise.IO.���л���.���л����ͷ����л���;

import java.io.*;


public class demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //���л�
        //��������
        Student s1 = new Student("zhangsan",23 ,"�Ͼ�");
        //�������л�������
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lib/txt/student.txt"));
        //д������
        oos.writeObject(s1);
        //�ͷ���Դ
        oos.close();

        //�����л�
        //���������л�����
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lib/txt/student.txt"));
        Object x = ois.readObject();
        System.out.println(x);
        ois.close();

    }
}
