package practise.Thread.ComprehensivePractise.demo2;

public class MyThread extends Thread{
    static int gift = 100;

    @Override
    public void run() {
        while (true){
            synchronized (Thread.class){
                if(gift<10){
                    break;
                }else{
                    gift--;
                    System.out.println(getName()+"�ͳ���һ�������ʣ"+gift+"��");
                }
            }
        }
    }
}
