package practise.Implements.���нӿںͳ������JavaBean;

public class Paddler extends Player implements SpeakEnglish {

    public Paddler() {
    }

    public Paddler(String name,int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("ѧ��ƹ����");
    }

    @Override
    public void SpeakEnglish() {
        System.out.println("˵Ӣ��");
    }

    public String toString() {
        return "Paddler{}";
    }
}
