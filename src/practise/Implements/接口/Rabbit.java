package practise.Implements.�ӿ�;

public class Rabbit extends Animals {


    public Rabbit() {
    }

    public Rabbit(String name ,int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("�Ժ��ܲ�");
    }

    public String toString() {
        return "Rabbit{}";
    }
}
