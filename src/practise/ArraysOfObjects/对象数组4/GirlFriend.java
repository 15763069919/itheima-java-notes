package practise.ArraysOfObjects.��������4;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;
    private String hobby;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, String gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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
    public String getGender() {
        return gender;
    }

    /**
     * ����
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
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
        return "GirlFriend{name = " + name + ", age = " + age + ", gender = " + gender + ", hobby = " + hobby + "}";
    }
}
