package practise.IO.序列化流.序列化流和反序列化流;

import java.io.*;


public class demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化
        //创建对象
        Student s1 = new Student("zhangsan",23 ,"南京");
        //创建序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lib/txt/student.txt"));
        //写出数据
        oos.writeObject(s1);
        //释放资源
        oos.close();

        //反序列化
        //创建反序列化对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lib/txt/student.txt"));
        Object x = ois.readObject();
        System.out.println(x);
        ois.close();

    }
}
