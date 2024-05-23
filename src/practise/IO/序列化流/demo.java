package practise.IO.序列化流;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student("zhangsan",23,"南京");
        Student s2 = new Student("lis",24,"深圳");
        Student s3 = new Student("wangwu",25,"北京");

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



        //未知对象个数 -- 存入集合然后对集合进行序列化存入文件
        //序列化
        //创建序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lib/txt/student.txt"));
        //创建集合
        ArrayList<Student> list = new ArrayList<>();
        //存入集合
        Collections.addAll(list,s1,s2,s3);
        //序列化集合
        oos.writeObject(list);

        //反序列化
        //创建反序列化对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lib/txt/student.txt"));
        list = (ArrayList<Student>) ois.readObject();
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
