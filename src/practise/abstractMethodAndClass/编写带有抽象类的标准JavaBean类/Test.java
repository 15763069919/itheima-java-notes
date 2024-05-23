package practise.abstractMethodAndClass.编写带有抽象类的标准JavaBean类;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("孙海博");
        d.setAge(19);
        System.out.println(d.getName());
        System.out.println(d.getAge());
        d.eat();
        d.drink();

        Frog f = new Frog("公旭",19);
        System.out.println(f.getName());
        System.out.println(f.getAge());
        f.eat();
        f.drink();

        Sheep s = new Sheep("俊鹏",19);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.eat();
        s.drink();
    }
}
