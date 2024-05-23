package practise.Implements.½Ó¿Ú;

public class Frog extends Animals implements Swim{

    public Frog() {
    }

    public Frog(String name,int age) {
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("³Ô³æ×Ó");
    }

    @Override
    public void swim() {
        System.out.println("ÍÜÓ¾");
    }


    public String toString() {
        return "Frog{}";
    }
}
