package practise.genericity.泛型的继承性和通配符.practice;

class Husky extends Dog {
    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的哈士奇，正在吃骨头，边吃边拆家");
    }
}