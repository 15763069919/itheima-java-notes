package practise.Extends.带有继承的标准JavaBean类;

public class Test2 {
    public static void main(String[] args) {

    }
}
class Employee {
    private String name;
    private int age;
}
class Teacher extends Employee {
    private String id;
    private String name;

}
class Lecturer extends Teacher {

}
class Tutor extends Teacher {

}



class AdminStaff extends Employee {

}
class Maintainer extends AdminStaff {

}
class Buyer extends AdminStaff {

}
