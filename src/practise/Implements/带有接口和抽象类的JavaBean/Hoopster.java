package practise.Implements.���нӿںͳ������JavaBean;

public class Hoopster extends Player {

    public Hoopster() {
    }

    public Hoopster(String name,int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("ѧ������");
    }

    public String toString() {
        return "Hoopster{}";
    }
}
