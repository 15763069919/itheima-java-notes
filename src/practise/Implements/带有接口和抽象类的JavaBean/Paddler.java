package practise.Implements.带有接口和抽象类的JavaBean;

public class Paddler extends Player implements SpeakEnglish {

    public Paddler() {
    }

    public Paddler(String name,int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void SpeakEnglish() {
        System.out.println("说英语");
    }

    public String toString() {
        return "Paddler{}";
    }
}
