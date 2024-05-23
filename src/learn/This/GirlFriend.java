package learn.This;


public class GirlFriend {
    private String name;//成员变量
    private int age;
    private String gender;

    //name
    //作用：给name成员变量赋值
    public void setName(String name) {//局部变量
        //=左边：成员变量name，=右边：局部变量name（触发就近原则）
        this.name = name;
    }

    //作用：对外提供name属性的
    public String getName() {
        return name;
    }

    //age
    public void setAge(int age) {
        if (age >= 18 && age <= 50)
            this.age = age;
        else
            System.out.println("非法参数");
    }

    public int getAge() {
        return age;
    }

    //gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }


    //行为
    public void sleep() {
        System.out.println("女朋友要睡觉");
    }

    public void eat() {
        System.out.println("女朋友要吃饭");
    }
}
