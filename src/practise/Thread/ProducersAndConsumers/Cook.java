package practise.Thread.ProducersAndConsumers;

public class Cook extends Thread {
    @Override
    public void run() {
        /*
         * 1.ѭ��
         * 2.ͬ�������
         * 3.�жϹ��������Ƿ���ĩβ������ĩβ��
         * 4.�жϹ��������Ƿ���ĩβ��û��ĩβ��ִ�к����߼���
         * */
        while(true){
            synchronized(Desk.lock){
                if(Desk.count == 0){
                    break;
                }else{
                    //�ж��������Ƿ���ʳ��
                    //�� -- �ȴ�
                    if(Desk.foodFlag == 1){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    //û�� -- ����ʳ��
                    else{
                        System.out.println("��ʦ����һ������");
                    //�޸������ϵ�ʳ��״̬
                    Desk.foodFlag = 1;
                    //���ѳԻ�����
                    Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
