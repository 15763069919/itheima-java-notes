package practise.Thread.ProducersAndConsumers;

public class Foodie extends Thread{
    @Override
    public void run() {
        /*
         * 1.ѭ��
         * 2.ͬ�������
         * 3.�жϹ��������Ƿ���ĩβ������ĩβ��
         * 4.�жϹ��������Ƿ���ĩβ��û��ĩβ��ִ�к����߼���
         * */
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    //�ж��������Ƿ�������
                    //���û�� -- �ȴ�
                    if (Desk.foodFlag == 0) {
                        try {
                            Desk.lock.wait();//�õ�ǰ�̸߳������а�
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        //�ѳԵ�����-1
                        Desk.count--;
                        //����� -- ����
                        System.out.println("�Ի����ڳ������������ٳ�" + Desk.count + "��");
                        //����� -- ���ѳ�ʦ������
                        Desk.lock.notifyAll();//����������󶨵������߳�
                        //�޸����ӵ�״̬
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }
}
