package practise.Static.��̬��������;
/*
    �ܽ᣺
        ��̬������û��this�ؼ���
        ��̬�����У�ֻ�ܷ��ʾ�̬
        �Ǿ�̬�������Է�������
 */
public class Student {
    //��Ա����
     String name;
    int age;
    public static String teacherName;

    //�Ǿ�̬��Ա����
    public void show1() {
        System.out.println(name + "," + age + "," + teacherName);
    }
    //��̬����
    public static void method() {
        System.out.println("��̬����");
    }
}
