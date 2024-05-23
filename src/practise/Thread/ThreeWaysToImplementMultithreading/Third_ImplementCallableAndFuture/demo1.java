package practise.Thread.ThreeWaysToImplementMultithreading.Third_ImplementCallableAndFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class demo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        * ���̵߳�����ʵ�ַ�ʽ��
        *   �ص㣺���Ի�ȡ�����߳����еĽ��
        *
        *   1.����һ����MyCallableʵ��Callable�ӿ�
        *   2.��дcall   ���з���ֵ������ֵ��ʾ���̵߳����н����
        *   3.����MyCallable���󣨱�ʾ���߳�Ҫִ�е�����
        *   4.����FutureTask�Ķ������ù�����߳����еĽ����
        *   5.����Thread��Ķ��󣨱�ʾ�̣߳���������
        * */

        //����MyCallable��ʾ���߳�Ҫִ�е�����
        MyCallable mc = new MyCallable();
        //����FutureTask���������߳����еĽ��
        FutureTask<Integer> ft = new FutureTask<>(mc);
        //�����̵߳Ķ���
        Thread t1 = new Thread(ft);
        //�����߳�
        t1.start();
        //��ȡ���߳����еĽ��
        Integer result = ft.get();
        System.out.println(result);

    }
}
