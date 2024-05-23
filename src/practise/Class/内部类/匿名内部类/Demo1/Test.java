package practise.Class.内部类.匿名内部类.Demo1;

public class Test {
    public static void main(String[] args) {

        new Swim(){
            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };
    }
}
