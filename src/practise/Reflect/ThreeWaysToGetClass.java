package practise.Reflect;

public class ThreeWaysToGetClass {
    public static void main(String[] args) throws ClassNotFoundException {
       //1
        //����
        Class<?> clazz1 = Class.forName("practise.Reflect.Student");
        System.out.println("clazz1"+clazz1);

        //2.
        ///���൱���������д���
        Class<Student> clazz2 = Student.class;
        System.out.println("clazz2"+clazz2);

        //3.
        //�������Ѿ����������Ķ���ʱ�ſ���ʹ��
        Student s = new Student();
        Class<? extends Student> clazz3 = s.getClass();
        System.out.println("clazz3"+clazz3);

    }
}
