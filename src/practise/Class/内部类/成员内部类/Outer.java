package practise.Class.内部类.成员内部类;

public class Outer {
    public Inner getInner(){
        return new Inner();
    }

    private class Inner{

    }

}
