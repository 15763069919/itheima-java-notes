package practise.Static.静态代码块;

public class Student {
    private String name;
    private int age;

    static {
        System.out.println("静态代码块");
    }

    {
        System.out.println("构造代码块");
    }

    public Student() {
        this(null ,0);
    }

    public Student(String name, int age) {
        System.out.println("构造方法");
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
