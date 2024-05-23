package learn.标准的JavaBean;

public class User {
    //属性
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

    //插件PTG
    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
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

    public String toString() {
        return "User{username = " + username + ", password = " + password + ", email = " + email + ", gender = " + gender + ", age = " + age + "}";
    }

//手动输入

//    //空参
//    public User(){}
//    //带参
//    public User(学习.String username,学习.String password,学习.String email,学习.String gender,int age){
//        this.username=username;
//        this.password=password;
//        this.email=email;
//        this.gender=gender;
//        this.age=age;
//    }
//    //get set
//    public void setUsername(学习.String username){
//        this.username = username;
//    }

    //快捷键alt+insert
//
//    public User() {
//    }
//
//    public User(学习.String username, 学习.String password, 学习.String email, 学习.String gender, int age) {
//        this.username = username;
//        this.password = password;
//        this.email = email;
//        this.gender = gender;
//        this.age = age;
//    }
//
//    public 学习.String getUsername() {
//        return username;
//    }
//
//    public void setUsername(学习.String username) {
//        this.username = username;
//    }
//
//    public 学习.String getPassword() {
//        return password;
//    }
//
//    public void setPassword(学习.String password) {
//        this.password = password;
//    }
//
//    public 学习.String getEmail() {
//        return email;
//    }
//
//    public void setEmail(学习.String email) {
//        this.email = email;
//    }
//
//    public 学习.String getGender() {
//        return gender;
//    }
//
//    public void setGender(学习.String gender) {
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
