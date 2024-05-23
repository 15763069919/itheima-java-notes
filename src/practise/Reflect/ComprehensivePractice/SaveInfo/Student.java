package practise.Reflect.ComprehensivePractice.SaveInfo;

public class Student {
    private String name;
    private int age;
    private char gender;
    private double height;
    private String hobby;

    public Student() {
    }

    public Student(String name, int age, char gender, double height, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.hobby = hobby;
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

    /**
     * ��ȡ
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * ����
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * ��ȡ
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * ����
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * ��ȡ
     * @return hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * ����
     * @param hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", gender = " + gender + ", height = " + height + ", hobby = " + hobby + "}";
    }
}
