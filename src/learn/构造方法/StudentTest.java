package learn.构造方法;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        //调用空参构造
//        Student s = new Student();

        //调用带参构造
        Student s = new Student("潘淑卿",18);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
