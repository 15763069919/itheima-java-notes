package practise.Class.内部类.匿名内部类.Demo2;

public class Test {
    public static void main(String[] args) {

       /* new Animal(){
            @Override
            public void eat() {
                System.out.println("重写了eat方法");
            }
        };*/

        //在测试类中调用下面的method方法？

        //以前的方式如何调用？
        //要自己写一个子类继承Animal类
        //再创建子类的对象，把对象传给method
        /*
        Dog d = new Dog();
        method(d);
        */
        //如果Dog只要用一次，那么还需要单独定义一个类，太麻烦了，
        //所以说可以用匿名内部类的方法简化代码
        method(
                //Animal的子类的对象
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );

        method(
                //Animal的子类的对象
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("猫吃鱼");
                    }
                }
        );
    }

    public static void method (Animal a){//传给Animal，Animal a = 子类对象  --》多态
        a.eat();                        //遵循编译看左边，运行看右边
    }
}
