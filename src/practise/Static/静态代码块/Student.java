package practise.Static.��̬�����;

public class Student {
    private String name;
    private int age;

    static {
        System.out.println("��̬�����");
    }

    {
        System.out.println("��������");
    }

    public Student() {
        this(null ,0);
    }

    public Student(String name, int age) {
        System.out.println("���췽��");
        this.name = name;
        this.age = age;
    }

    /**
     * ��ȡ
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * ����
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * ����
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
