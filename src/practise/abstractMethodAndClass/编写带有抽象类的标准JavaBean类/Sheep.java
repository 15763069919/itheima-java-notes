package practise.abstractMethodAndClass.编写带有抽象类的标准JavaBean类;

public class Sheep extends Animal {
    @Override
    public void eat(){
        System.out.println("吃草");
    }
    public Sheep() {
    }
    public Sheep(String name,int age) {
        super(name,age);
    }
}
