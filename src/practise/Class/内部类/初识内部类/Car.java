package practise.Class.�ڲ���.��ʶ�ڲ���;

public class Car {
    private String carName;
    String carColor;
    String carAge;
    public void show(){
        System.out.println(carName);
        //System.out.println(engineName);//err
    }

    class Engine{
        String engineName;
        String engineAge;
        public void show(){
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
}
