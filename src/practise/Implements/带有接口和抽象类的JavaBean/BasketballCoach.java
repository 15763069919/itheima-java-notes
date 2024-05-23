package practise.Implements.带有接口和抽象类的JavaBean;

public class BasketballCoach extends Coach {

    public BasketballCoach() {
    }

    public BasketballCoach(String name,int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教篮球");
    }

    public String toString() {
        return "BasketballCoach{}";
    }
}
