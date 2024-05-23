package practise.polymorphism;

public class 多态调用成员的特点 {
    public static void main(String[] args) {
        Animal d = new Dog();
        //*调用成员变量：
        System.out.println(d.name);//Animal //首先去左边的类型去找成员变量
        //编译看左边，运行也看左边
        //编译看左边：javac在编译的时候，会看左边的父类有没有这个成员，如果有，编译通过，如果没有，编译失败
        //运行看左边：java在运行的时候，实际获取的就是左边父类中的成员变量的值

        //*调用成员方法：
        d.show();//狗的show方法 //覆盖了父类的show方法
        //编译看左边，运行看右边
        //编译看左边：javac在编译的时候，会看左边的父类有没有这个成员，如果有，编译通过，如果没有，编译失败
        //运行看右边：java在运行的时候，实际调用的是右边子类中的成员方法

        //理解：
        //Animal d = new Dog();
        //Dog d = new Dog();
        //现在用d去调用变量和方法的呀？是的
        //而d是Animal类型的，所以默认都会从Animal这个类中去找

        //之前我们是用Dog这个子类去调用的，所有获取的是子的name，而现在是Animal这个父类去调用的，所以获取的是父的name
        //成员变量：在子类的对象中，会把父类的成员变量也继承下来。父：name。子：name
        //成员方法：如果子类对方法进行了重写，那么在虚方法表中是会把父类的方法进行覆盖的。

    }
}

class Animal {
    String name = "Animal";

    public void show() {
        System.out.println("动物的show方法");

    }
}

class Dog extends Animal{
    String name = "Dog";
    @Override
    public void show() {
        System.out.println("狗的show方法");
    }
}
class Cat extends Animal{
    String name = "Cat";
    @Override
    public void show() {
        System.out.println("猫的show方法");
    }
}
