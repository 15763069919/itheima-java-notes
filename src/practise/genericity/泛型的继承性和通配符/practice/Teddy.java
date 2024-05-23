package practise.genericity.泛型的继承性和通配符.practice;

class Teddy extends Dog {
    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的泰迪，正在吃骨头，边吃边蹭");
    }
}
