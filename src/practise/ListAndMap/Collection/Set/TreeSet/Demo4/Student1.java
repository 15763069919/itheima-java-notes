package practise.ListAndMap.Collection.Set.TreeSet.Demo4;

public class Student1 implements Comparable<Student1> {
    private String name;
    private int age;
    private double Chinese;
    private double English;
    private double Math;

    public Student1() {
    }

    public Student1(String name, int age, double Chinese, double English, double Math) {
        this.name = name;
        this.age = age;
        this.Chinese = Chinese;
        this.English = English;
        this.Math = Math;
    }

    @Override
    public int compareTo(Student1 o) {
        double v = this.getChinese() + this.getEnglish() + this.getMath() - (o.getChinese() + o.getEnglish() + o.getMath());
        v = v == 0 ? this.getChinese()-o.getChinese() : v ;
        v = v == 0 ? this.getMath()-o.getMath() : v ;
        v = v == 0 ? this.getEnglish()-o.getEnglish() : v ;

        if(v > 0) v = 1;
        else if (v<0) v = -1;
        else v = 0;
        return (int)v;
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
        return "Student1{name = " + name + ", age = " + age + ", Chinese = " + Chinese + ", English = " + English + ", Math = " + Math + "}";
    }
}
