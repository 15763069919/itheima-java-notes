package practise.Implements.�ӿ�;

public class Dog extends Animals implements Swim{

    public Dog() {
    }

    public Dog(String name,int age) {
        super(name,age);

    }

    @Override
    public void eat() {
        System.out.println("�Թ�ͷ");
    }

    @Override
    public void swim() {
        System.out.println("����");

    }

    public String toString() {
        return "Dog{}";
    }
}
