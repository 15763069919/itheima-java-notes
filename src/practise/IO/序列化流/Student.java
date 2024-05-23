package practise.IO.序列化流;

import java.io.Serial;
import java.io.Serializable;

/*
 *   Serializable接口里没有抽象方法 -- 标记型接口
 *   一旦实现了这个接口，就表明这个类可以被序列化
 * */
public class Student implements Serializable {

    @Serial
    private static final long serialVersionUID = 726583663150232745L;
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
