package practise.ArrayList;

import practise.ArrayList.添加学生对象并遍历.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class 键盘录入学生对象 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> list = new ArrayList<>();
        //键盘录入
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生姓名：");
            Student s = new Student();
            s.setName(sc.nextLine());
            System.out.println("请输入学生年龄：");
            s.setAge(sc.nextInt());
            //把学生对象赋值给集合
            list.add(s);
        }

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + "," + list.get(i).getAge());
        }

    }
}