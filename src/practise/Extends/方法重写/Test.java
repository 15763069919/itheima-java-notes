package practise.Extends.������д;

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
        System.out.println("�Թ���");
    }
    public void drink() {
        System.out.println("��ˮ");
    }
    public void lookHome() {
        System.out.println("����");
    }
}

class Husky extends Dog {

    public void breakHome() {
        System.out.println("���");
    }
}

class SharpeiDog extends Dog {
    @Override
    public void eat(){
        super.eat();//�Թ���
        System.out.println("�Թ�ͷ");
    }
}

class ChineseCountryDog extends Dog {
    @Override
public void eat() {
        System.out.println("��ʣ��");
    }
}
