package practise.Reflect;

public class ThreeWaysToGetClass {
    public static void main(String[] args) throws ClassNotFoundException {
       //1
        //常用
        Class<?> clazz1 = Class.forName("practise.Reflect.Student");
        System.out.println("clazz1"+clazz1);

        //2.
        ///更多当作参数进行传递
        Class<Student> clazz2 = Student.class;
        System.out.println("clazz2"+clazz2);

        //3.
        //当我们已经有了这个类的对象时才可以使用
        Student s = new Student();
        Class<? extends Student> clazz3 = s.getClass();
        System.out.println("clazz3"+clazz3);

    }
}
