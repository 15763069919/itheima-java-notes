package practise.Class.内部类.初识内部类;

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
