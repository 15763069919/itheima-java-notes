package practise.Thread.ThreeWaysToImplementMultithreading.First_ExtendsThread;

public class demo1 {
    public static void main(String[] args) {
        /*
        *  ���̵߳ĵ�һ��������ʽ
        *       1.�Լ�����һ����̳�Thread
        *       2.��дrun����
        *       3.��������Ķ��󣬲������߳�
        * */

        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();

        //���߳��������
        t1.setName("�߳�1");
        t2.setName("�߳�2");

        //�����߳�
        t1.start();
        t2.start();
    }
}
