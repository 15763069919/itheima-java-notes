package practise.Extends.�̳еĳ�Ա�����ص�;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.lunch();
    }
}

class Person {
    public void eat() {
        System.out.println("�Է�");
    }

    public void drink() {
        System.out.println("�ȿ�ˮ");
    }
}

class Student extends Person {
    public void lunch() {
        eat();
        drink();
    }
}