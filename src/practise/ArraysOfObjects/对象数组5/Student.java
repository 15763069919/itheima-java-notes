package practise.ArraysOfObjects.��������5;

public class Student {
    private int id;
    private String name;
    private int age;


    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * ��ȡ
     * @return num
     */
    public int getId() {
        return id;
    }

    /**
     * ����
     * @param id
     */
    public void setId(int id) {
        this.id = id;
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
        return "Student{num = " + id + ", name = " + name + ", age = " + age + "}";
    }
}
