package practise.Thread.ThreadSafeAndSynchronised.SynchronisedCodeBlock;

public class MyThread extends Thread{
    static int ticket = 0; //0~99

    //锁对象
    static Object obj = new Object();

    @Override
    public void run() {
        while(true){
            //把共享数据的代码给锁起来
            synchronized (obj){
                if(ticket<100){//票没卖完
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName()+"正在卖第"+ticket+"张票");
                }else{
                    break;
                }
            }
        }
    }
}
