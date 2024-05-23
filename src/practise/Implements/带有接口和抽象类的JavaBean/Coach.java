package practise.Implements.带有接口和抽象类的JavaBean;

public abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(String name,int age) {
        super(name,age);
    }

    public abstract void teach();

    public String toString() {
        return "Coach{}";
    }
}
