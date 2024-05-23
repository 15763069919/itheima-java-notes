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

    /**
     * 获取
     * @return Chinese
     */
    public double getChinese() {
        return Chinese;
    }

    /**
     * 设置
     * @param Chinese
     */
    public void setChinese(double Chinese) {
        this.Chinese = Chinese;
    }

    /**
     * 获取
     * @return English
     */
    public double getEnglish() {
        return English;
    }

    /**
     * 设置
     * @param English
     */
    public void setEnglish(double English) {
        this.English = English;
    }

    /**
     * 获取
     * @return Math
     */
    public double getMath() {
        return Math;
    }

    /**
     * 设置
     * @param Math
     */
    public void setMath(double Math) {
        this.Math = Math;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", Chinese = " + Chinese + ", English = " + English + ", Math = " + Math + "}";
    }
}
