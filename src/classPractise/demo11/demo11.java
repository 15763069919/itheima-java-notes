package classPractise.demo11;


public class demo11 {
    public static void main(String[] args) {
        //创建模拟器对象
        Simulator simulator = new Simulator();
        //创建God对象
        Dog dog = new Dog("狗");
        //获取狗的名字并打印在控制台
        System.out.print(dog.getAnimalName() + ":");
        //使用多态接收狗的对象
        simulator.playSound(dog);
        //创建猫的对象
        Cat cat = new Cat("猫");
        //获取猫的名字
        System.out.print(cat.getAnimalName() + ":");
        //使用多态接收猫的对象
        simulator.playSound(null);
    }
}

abstract class Animal {
    //下面的标准JavaBean为插件PTG生成，不是复制粘贴网上的
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void cry();

    public abstract String getAnimalName();

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Animal{name = " + name + "}";
    }
}

class Simulator {
    void playSound(Animal animal) {
        animal.cry();
    }
}

class Dog extends Animal {
    //下面的标准JavaBean为插件PTG生成，不是复制粘贴网上的
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    /**
     *
     */
    @Override
    public void cry() {
        System.out.println("汪汪汪！");
    }

    /**
     *
     */
    @Override
    public String getAnimalName() {
        return this.getName();
    }
}

class Cat extends Animal {
    //下面的标准JavaBean为插件PTG生成，不是复制粘贴网上的
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    /**
     *
     */
    @Override
    public void cry() {
        System.out.println("喵喵喵！");
    }

    /**
     *
     */
    @Override
    public String getAnimalName() {
        return this.getName();
    }
}
