package practise.Extends.继承的成员方法特点;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.lunch();
    }
}

class Person {
    public void eat() {
        System.out.println("吃饭");
    }

    public void drink() {
        System.out.println("喝开水");
    }
}

class Student extends Person {
    public void lunch() {
        eat();
        drink();
    }
}