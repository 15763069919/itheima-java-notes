package practise.ArrayList.添加学生对象并遍历;

import java.util.ArrayList;

public class 添加学生对象并遍历 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2.创建学生对象
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);

        //3.添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //4.遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+","+list.get(i).getAge());
        }
    }
}
