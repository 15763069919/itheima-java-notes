package practise.Class.�ڲ���.�ֲ��ڲ���;

public class Outer {
        int b = 20;
    public void show(){
        int a = 10;
        class Inner{
            String name;
            int age;
            public void method1(){
                System.out.println(a);
                System.out.println(b);
                System.out.println("�ֲ����е�method1�Ǿ�̬����");
            }
            static public void method2() {
                System.out.println("�ֲ����е�method1��̬����");
            }
        }
        System.out.println(new Inner().name);
        System.out.println(new Inner().age);
        new Inner().method1();
        Inner.method2();
    }
}
