package practise.methodCite;

import java.util.ArrayList;
import java.util.Collections;

public class demo4 {
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();
        Student2 s1 = new Student2("zhangsan",23);
        Student2 s2 = new Student2("lisi",24);
        Student2 s3 = new Student2("wangwu",25);

        Collections.addAll(list,s1,s2,s3);
//        list.stream().map(Student2::getName).
//        list.stream().map(Student2::getAge).
    }
}
class Student2{
    private String name;
    private int age;

    public Student2() {
    }

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + "}";
    }
}