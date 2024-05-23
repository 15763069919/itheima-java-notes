package practise.Implements.带有接口和抽象类的JavaBean;

public class Hoopster extends Player {

    public Hoopster() {
    }

    public Hoopster(String name,int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打篮球");
    }

    public String toString() {
        return "Hoopster{}";
    }
}
