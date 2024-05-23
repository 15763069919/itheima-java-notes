package learn.Private;


public class GirlFriend {
    private String name;
    private int age;
    private String gender;

    //name
    //作用：给name成员变量赋值
    public void setName(String n){
        name=n;
    }
    //作用：对外提供name属性的
    public String getName(){
        return name;
    }

    //age
    public void setAge(int a){
        if(a>=18&&a<=50)
            age=a;
        else
            System.out.println("非法参数");
    }
    public int getAge(){
        return age;
    }

    //gender
    public void setGender(String g){
        gender=g;
    }
    public String getGender(){
        return gender;
    }








    //行为
    public void sleep(){
        System.out.println("女朋友要睡觉");
    }
    public void eat(){
        System.out.println("女朋友要吃饭");
    }
}
