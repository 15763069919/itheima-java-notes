package practise.abstractMethodAndClass.��д���г�����ı�׼JavaBean��;

public class Frog extends Animal{
    public Frog() {
    }

    public Frog(String name,int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("�Գ���");
    }

    public String toString() {
        return "Frog{}";
    }
}
