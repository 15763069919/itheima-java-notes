package practise.abstractMethodAndClass.��д���г�����ı�׼JavaBean��;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("�ﺣ��");
        d.setAge(19);
        System.out.println(d.getName());
        System.out.println(d.getAge());
        d.eat();
        d.drink();

        Frog f = new Frog("����",19);
        System.out.println(f.getName());
        System.out.println(f.getAge());
        f.eat();
        f.drink();

        Sheep s = new Sheep("����",19);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.eat();
        s.drink();
    }
}
