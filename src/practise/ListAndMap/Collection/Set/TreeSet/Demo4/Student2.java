package practise.ListAndMap.Collection.Set.TreeSet.Demo4;

public class Student2 {
    private String name;
    private int age;
    private double Chinese;
    private double English;
    private double Math;


    public Student2() {
    }

    public Student2(String name, int age, double Chinese, double English, double Math) {
        this.name = name;
        this.age = age;
        this.Chinese = Chinese;
        this.English = English;
        this.Math = Math;
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
     * @return Chinese
     */
    public double getChinese() {
        return Chinese;
    }

    /**
     * ����
     * @param Chinese
     */
    public void setChinese(double Chinese) {
        this.Chinese = Chinese;
    }

    /**
     * ��ȡ
     * @return English
     */
    public double getEnglish() {
        return English;
    }

    /**
     * ����
     * @param English
     */
    public void setEnglish(double English) {
        this.English = English;
    }

    /**
     * ��ȡ
     * @return Math
     */
    public double getMath() {
        return Math;
    }

    /**
     * ����
     * @param Math
     */
    public void setMath(double Math) {
        this.Math = Math;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", Chinese = " + Chinese + ", English = " + English + ", Math = " + Math + "}";
    }
}
