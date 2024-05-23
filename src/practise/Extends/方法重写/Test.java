package practise.Extends.·½·¨ÖØÐ´;

public class Test {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();
        System.out.println("------------");
        ChineseCountryDog c = new ChineseCountryDog();
        c.eat();
        c.drink();
        c.lookHome();
        System.out.println("------------");
        SharpeiDog s = new SharpeiDog();
        s.eat();
        s.drink();
        s.lookHome();

    }
}

class Dog {
    public void eat() {
        System.out.println("³Ô¹·Á¸");
    }
    public void drink() {
        System.out.println("ºÈË®");
    }
    public void lookHome() {
        System.out.println("¿´¼Ò");
    }
}

class Husky extends Dog {

    public void breakHome() {
        System.out.println("²ð¼Ò");
    }
}

class SharpeiDog extends Dog {
    @Override
    public void eat(){
        super.eat();//³Ô¹·Á¸
        System.out.println("³Ô¹ÇÍ·");
    }
}

class ChineseCountryDog extends Dog {
    @Override
public void eat() {
        System.out.println("³ÔÊ£·¹");
    }
}
