package practise.methodCite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class demo3 {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        Student1 s1 = new Student1("张三",23);
        Student1 s2 = new Student1("李四",24);
        Student1 s3 = new Student1("王五",25);

        Collections.addAll(list,s1,s2,s3);

       /* String[] array = list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        }).toArray(String[]::new);
        System.out.println(Arrays.toString(array));*/

        String[] array = list.stream().map(Student1::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }
}
class Student1 {
    private String name;
    private int age;


    public Student1() {
    }

    public Student1(String str){
        String name = str.split(",")[0];
        int age = Integer.parseInt(str.split(",")[1]);
        this.name = name;
        this.age = age;
    }

    public Student1(String name, int age) {
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

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

}