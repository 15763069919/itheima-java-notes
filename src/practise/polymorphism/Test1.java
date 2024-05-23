package practise.polymorphism;

public class Test1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("����");
        s.setAge(23);
        show(s);

        Teacher t = new Teacher();
        t.setName("����");
        t.setAge(34);
        show(t);

        Administrator a = new Administrator();
        a.setName("����");
        a.setAge(45);
        show(a);

    }
    public static void show(Person p){
        p.show();
    }
}
class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * ��ȡ
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * ����
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * ����
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("������"+name+",���䣺"+age);
    }
}
class Student extends Person{
    @Override
    public void show() {
        System.out.println("ѧ��������"+getName()+",ѧ�����䣺"+getAge());
    }
}
class Teacher extends Person{
    @Override
    public void show() {
        System.out.println("��ʦ������"+getName()+",��ʦ���䣺"+getAge());
    }
}
class Administrator extends Person{
    @Override
    public void show() {
        System.out.println("����Ա������"+getName()+",����Ա���䣺"+getAge());
    }
}



