package classPractise.demo11;


public class demo11 {
    public static void main(String[] args) {
        //����ģ��������
        Simulator simulator = new Simulator();
        //����God����
        Dog dog = new Dog("��");
        //��ȡ�������ֲ���ӡ�ڿ���̨
        System.out.print(dog.getAnimalName() + ":");
        //ʹ�ö�̬���չ��Ķ���
        simulator.playSound(dog);
        //����è�Ķ���
        Cat cat = new Cat("è");
        //��ȡè������
        System.out.print(cat.getAnimalName() + ":");
        //ʹ�ö�̬����è�Ķ���
        simulator.playSound(null);
    }
}

abstract class Animal {
    //����ı�׼JavaBeanΪ���PTG���ɣ����Ǹ���ճ�����ϵ�
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void cry();

    public abstract String getAnimalName();

    /**
     * ��ȡ
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * ����
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
    //����ı�׼JavaBeanΪ���PTG���ɣ����Ǹ���ճ�����ϵ�
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
        System.out.println("��������");
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
    //����ı�׼JavaBeanΪ���PTG���ɣ����Ǹ���ճ�����ϵ�
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
        System.out.println("��������");
    }

    /**
     *
     */
    @Override
    public String getAnimalName() {
        return this.getName();
    }
}
