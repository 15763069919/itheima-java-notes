package practise.Class.�ڲ���.�����ڲ���.Demo2;

public class Test {
    public static void main(String[] args) {

       /* new Animal(){
            @Override
            public void eat() {
                System.out.println("��д��eat����");
            }
        };*/

        //�ڲ������е��������method������

        //��ǰ�ķ�ʽ��ε��ã�
        //Ҫ�Լ�дһ������̳�Animal��
        //�ٴ�������Ķ��󣬰Ѷ��󴫸�method
        /*
        Dog d = new Dog();
        method(d);
        */
        //���DogֻҪ��һ�Σ���ô����Ҫ��������һ���̫࣬�鷳�ˣ�
        //����˵�����������ڲ���ķ����򻯴���
        method(
                //Animal������Ķ���
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("���Թ�ͷ");
                    }
                }
        );

        method(
                //Animal������Ķ���
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("è����");
                    }
                }
        );
    }

    public static void method (Animal a){//����Animal��Animal a = �������  --����̬
        a.eat();                        //��ѭ���뿴��ߣ����п��ұ�
    }
}
