package practise.Thread.ThreadPool.CustomThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class demo1 {
    public static void main(String[] args) {
        /*
        * ThreadPoolExecutor threadPoolExecutor = new threadPoolExecutor
        * (�����߳���������߳����������߳������ʱ�䣬������У������̹߳���������ľܾ�����);
        *
        *   ����һ�������߳���               ����С��0
        *   ������������߳���               ����С�ڵ����㣬������� >= �����߳�����
        *   �������������߳������ʱ��       ����С��0
        *   �����ģ�ʱ�䵥λ                 ��TimeUnitָ��
        *   �����壺�������                 ����Ϊnull
        *   �������������̹߳���             ����Ϊnull
        *   �����ߣ�����ľܾ�����            ����Ϊnull
        * */

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3, //�����߳�����������С��0
                6,//����߳�����
                60,//�����̵߳������ʱ��
                TimeUnit.SECONDS,//ʱ�䵥λ
                 new ArrayBlockingQueue<>(3),//�������
                Executors.defaultThreadFactory(),//�����̹߳���
                new ThreadPoolExecutor.AbortPolicy()//����ľܾ�����
                );
//        pool.submit(����);  //�ύ����
    }
}
