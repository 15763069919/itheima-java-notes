package practise.Thread.ThreeWaysToImplementMultithreading.First_ExtendsThread;

public class Mythread extends Thread{
    @Override
    public void run() {
        //��д�߳�Ҫִ�еĴ���
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"hello world");
        }
        super.run();
    }
}
