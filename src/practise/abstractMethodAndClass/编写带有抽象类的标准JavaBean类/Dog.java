package practise.abstractMethodAndClass.��д���г�����ı�׼JavaBean��;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name,int age) {
        super(name,age);
    }

    @Override
    public void eat(){
        System.out.println("�Թ�ͷ");
    }

    public String toString() {
        return "Dog{}";
    }
}