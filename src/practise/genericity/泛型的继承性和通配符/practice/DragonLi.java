package practise.genericity.泛型的继承性和通配符.practice;

class DragonLi extends Cat {
    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的狸花猫，正在吃鱼");
    }
}