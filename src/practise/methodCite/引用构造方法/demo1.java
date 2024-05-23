package practise.methodCite.引用构造方法;

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌,14","周芷若,15","赵敏,16","张强,17","张三丰,18");
      /*  list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                return new Student(s.split(",")[0],Integer.parseInt(s.split(",")[1]));
            }
        }).forEach(System.out::println);*/

        list.stream().map(Student::new).forEach(System.out::println);

    }
}
class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //再写一个构造方法，不需要管返回值，只管形参即可
    public Student(String s) {
        this.name = s.split(",")[0];
        this.age = Integer.parseInt(s.split(",")[1]);
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
        return "Student{name = " + name + ", age = " + age + "}";
    }
}