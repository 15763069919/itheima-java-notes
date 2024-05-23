package practise.Implements.带有接口和抽象类的JavaBean;

public abstract class Player extends Person {
    public Player() {
    }

    public Player(String name,int age) {
        super(name, age);
    }

    public abstract void study();


    public String toString() {
        return "Player{}";
    }
}
