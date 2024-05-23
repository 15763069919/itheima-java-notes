package practise.polymorphism;

public class Test1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(23);
        show(s);

        Teacher t = new Teacher();
        t.setName("李四");
        t.setAge(34);
        show(t);

        Administrator a = new Administrator();
        a.setName("王五");
        a.setAge(45);
        show(a);

    }
    public static void show(Person p){
        p.show();
    }
}
class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    public void show(){
        System.out.println("姓名："+name+",年龄："+age);
    }
}
class Student extends Person{
    @Override
    public void show() {
        System.out.println("学生姓名："+getName()+",学生年龄："+getAge());
    }
}
class Teacher extends Person{
    @Override
    public void show() {
        System.out.println("老师姓名："+getName()+",老师年龄："+getAge());
    }
}
class Administrator extends Person{
    @Override
    public void show() {
        System.out.println("管理员姓名："+getName()+",管理员年龄："+getAge());
    }
}



