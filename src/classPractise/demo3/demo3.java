package classPractise.demo3;

public class demo3 {

    public static void main(String args[]) {

        B b = new B();

        b.setX(-100);   //x = 100 y = -200

        b.setY(-200);

        System.out.println("sum=" + b.getXYSum());

    }

}

 class B {

    int x = 100, y = 200;

    public void setX(int x) {

        x = x;

    }

    public void setY(int y) {

        this.y = y;

    }

    public int getXYSum() {

        return x + y;

    }

}