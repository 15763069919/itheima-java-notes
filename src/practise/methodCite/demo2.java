package practise.methodCite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"����,23","����,24","����,25","����,26");
        List<Student1> collect = list.stream().map(Student1::new).collect(Collectors.toList());
        collect.forEach(System.out::println);


    }
}
class Student{
    private String name;
    private int age;


    public Student() {
    }

    public Student(String str){
        String name = str.split(",")[0];
        int age = Integer.parseInt(str.split(",")[1]);
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * ��ȡ
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * ����
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * ����
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}