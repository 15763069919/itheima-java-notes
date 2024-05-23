package practise.Thread.ThreadSafeAndSynchronised.SynchronisedCodeBlock;

public class MyThread extends Thread{
    static int ticket = 0; //0~99

    //������
    static Object obj = new Object();

    @Override
    public void run() {
        while(true){
            //�ѹ������ݵĴ����������
            synchronized (obj){
                if(ticket<100){//Ʊû����
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName()+"��������"+ticket+"��Ʊ");
                }else{
                    break;
                }
            }
        }
    }
}
