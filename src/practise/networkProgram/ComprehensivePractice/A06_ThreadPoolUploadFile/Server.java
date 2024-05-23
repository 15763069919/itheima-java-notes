package practise.networkProgram.ComprehensivePractice.A06_ThreadPoolUploadFile;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.���ӿͻ���
        // ����������׽��ֶ���
        ServerSocket ss = new ServerSocket(10012);

        //�����̳߳ض���
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,//�����߳���
                16,//����߳���
                60,//����ʱ��
                TimeUnit.SECONDS,//����ʱ�䵥λ
                new ArrayBlockingQueue<>(2),//��������
                Executors.defaultThreadFactory(),//�̹߳��������̳߳���δ����Զ���
                new ThreadPoolExecutor.AbortPolicy());//����ܾ�����


        while (true) {
            //�������ӻ�ȡ�ͻ����׽���
            Socket socket = ss.accept();

            System.out.println("�ͻ������ӳɹ�");
//            new Thread(new MyRunnable(socket)).start();
            pool.submit(new MyRunnable(socket));
        }
    }
}
