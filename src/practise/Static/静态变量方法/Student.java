package practise.Static.静态变量方法;
/*
    总结：
        静态方法中没有this关键字
        静态方法中，只能访问静态
        非静态方法可以访问所有
 */
public class Student {
    //成员变量
     String name;
    int age;
    public static String teacherName;

    //非静态成员方法
    public void show1() {
        System.out.println(name + "," + age + "," + teacherName);
    }
    //静态方法
    public static void method() {
        System.out.println("静态方法");
    }
}
