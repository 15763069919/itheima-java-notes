package practise.Implements.�ӿ�;

public class Frog extends Animals implements Swim{

    public Frog() {
    }

    public Frog(String name,int age) {
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("�Գ���");
    }

    @Override
    public void swim() {
        System.out.println("��Ӿ");
    }


    public String toString() {
        return "Frog{}";
    }
}
