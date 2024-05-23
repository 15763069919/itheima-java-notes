package practise.Implements.½Ó¿Ú;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("zhangsan",23);
        System.out.println(d.getName());
        System.out.println(d.getAge());
        d.swim();
        Rabbit r = new Rabbit("lisi",24);
        System.out.println(r.getName());
        System.out.println(r.getAge());

        Frog f = new Frog("wangwu",25);
        System.out.println(f.getName());
        System.out.println(f.getAge());
        f.swim();
    }
}
