package learn.��׼��JavaBean;

public class User {
    //����
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    public User() {
    }

    public User(String username, String password, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    //���PTG
    /**
     * ��ȡ
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * ����
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * ��ȡ
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * ����
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ��ȡ
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * ����
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
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
        return "User{username = " + username + ", password = " + password + ", email = " + email + ", gender = " + gender + ", age = " + age + "}";
    }

//�ֶ�����

//    //�ղ�
//    public User(){}
//    //����
//    public User(ѧϰ.String username,ѧϰ.String password,ѧϰ.String email,ѧϰ.String gender,int age){
//        this.username=username;
//        this.password=password;
//        this.email=email;
//        this.gender=gender;
//        this.age=age;
//    }
//    //get set
//    public void setUsername(ѧϰ.String username){
//        this.username = username;
//    }

    //��ݼ�alt+insert
//
//    public User() {
//    }
//
//    public User(ѧϰ.String username, ѧϰ.String password, ѧϰ.String email, ѧϰ.String gender, int age) {
//        this.username = username;
//        this.password = password;
//        this.email = email;
//        this.gender = gender;
//        this.age = age;
//    }
//
//    public ѧϰ.String getUsername() {
//        return username;
//    }
//
//    public void setUsername(ѧϰ.String username) {
//        this.username = username;
//    }
//
//    public ѧϰ.String getPassword() {
//        return password;
//    }
//
//    public void setPassword(ѧϰ.String password) {
//        this.password = password;
//    }
//
//    public ѧϰ.String getEmail() {
//        return email;
//    }
//
//    public void setEmail(ѧϰ.String email) {
//        this.email = email;
//    }
//
//    public ѧϰ.String getGender() {
//        return gender;
//    }
//
//    public void setGender(ѧϰ.String gender) {
//        this.gender = gender;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }




}
