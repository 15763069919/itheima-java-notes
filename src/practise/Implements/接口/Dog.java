package practise.Implements.½Ó¿Ú;

public class Dog extends Animals implements Swim{

    public Dog() {
    }

    public Dog(String name,int age) {
        super(name,age);

    }

    @Override
    public void eat() {
        System.out.println("³Ô¹ÇÍ·");
    }

    @Override
    public void swim() {
        System.out.println("¹·ÅÙ");

    }

    public String toString() {
        return "Dog{}";
    }
}
