package practise.genericity.泛型的继承性和通配符.practice;

class Persian extends Cat {
    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的波斯猫，正在吃小饼干");
    }
}

