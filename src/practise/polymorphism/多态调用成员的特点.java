package practise.polymorphism;

public class ��̬���ó�Ա���ص� {
    public static void main(String[] args) {
        Animal d = new Dog();
        //*���ó�Ա������
        System.out.println(d.name);//Animal //����ȥ��ߵ�����ȥ�ҳ�Ա����
        //���뿴��ߣ�����Ҳ�����
        //���뿴��ߣ�javac�ڱ����ʱ�򣬻ῴ��ߵĸ�����û�������Ա������У�����ͨ�������û�У�����ʧ��
        //���п���ߣ�java�����е�ʱ��ʵ�ʻ�ȡ�ľ�����߸����еĳ�Ա������ֵ

        //*���ó�Ա������
        d.show();//����show���� //�����˸����show����
        //���뿴��ߣ����п��ұ�
        //���뿴��ߣ�javac�ڱ����ʱ�򣬻ῴ��ߵĸ�����û�������Ա������У�����ͨ�������û�У�����ʧ��
        //���п��ұߣ�java�����е�ʱ��ʵ�ʵ��õ����ұ������еĳ�Ա����

        //��⣺
        //Animal d = new Dog();
        //Dog d = new Dog();
        //������dȥ���ñ����ͷ�����ѽ���ǵ�
        //��d��Animal���͵ģ�����Ĭ�϶����Animal�������ȥ��

        //֮ǰ��������Dog�������ȥ���õģ����л�ȡ�����ӵ�name����������Animal�������ȥ���õģ����Ի�ȡ���Ǹ���name
        //��Ա������������Ķ����У���Ѹ���ĳ�Ա����Ҳ�̳�����������name���ӣ�name
        //��Ա�������������Է�����������д����ô���鷽�������ǻ�Ѹ���ķ������и��ǵġ�

    }
}

class Animal {
    String name = "Animal";

    public void show() {
        System.out.println("�����show����");

    }
}

class Dog extends Animal{
    String name = "Dog";
    @Override
    public void show() {
        System.out.println("����show����");
    }
}
class Cat extends Animal{
    String name = "Cat";
    @Override
    public void show() {
        System.out.println("è��show����");
    }
}
