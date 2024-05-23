package practise.Implements.½Ó¿Ú;

public class Rabbit extends Animals {


    public Rabbit() {
    }

    public Rabbit(String name ,int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("³ÔºúÂÜ²·");
    }

    public String toString() {
        return "Rabbit{}";
    }
}
