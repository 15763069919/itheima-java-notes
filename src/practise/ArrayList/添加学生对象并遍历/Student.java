package practise.ArrayList.添加学生对象并遍历;

public class Student {
    private String name;
    private int age;

    public Student(){};
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

}
