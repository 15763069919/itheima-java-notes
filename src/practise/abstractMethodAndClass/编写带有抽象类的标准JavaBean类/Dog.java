package practise.abstractMethodAndClass.编写带有抽象类的标准JavaBean类;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name,int age) {
        super(name,age);
    }

    @Override
    public void eat(){
        System.out.println("吃骨头");
    }

    public String toString() {
        return "Dog{}";
    }
}