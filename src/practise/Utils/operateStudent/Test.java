package practise.Utils.operateStudent;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三",23,"男");
        Student s2 = new Student("李四",24,"女");
        Student s3 = new Student("王五",25,"沃尔玛塑料袋");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(studentUtil.oldest(list));;
    }
}
