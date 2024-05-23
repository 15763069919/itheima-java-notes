package practise.Object和Objects;

import java.util.Objects;

public class demo1 {
    public static void main(String[] args) {
        Student s1 = null;
        Student s2 = new Student("zhangsan",23);
        Student s3 = new Student("zhangsan",23);

        //System.out.println(s1.equals(s4)); //err
        System.out.println(Objects.equals(s1,s2));
        System.out.println(s2.equals(s3));
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
