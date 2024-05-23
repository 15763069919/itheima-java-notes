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
        return "Student1{name = " + name + ", age = " + age + ", Chinese = " + Chinese + ", English = " + English + ", Math = " + Math + "}";
    }
}
