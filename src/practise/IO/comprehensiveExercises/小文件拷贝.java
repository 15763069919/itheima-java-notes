package practise.IO.comprehensiveExercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class С�ļ����� {
    public static void main(String[] args) throws IOException {
        //��
        FileInputStream fis = new FileInputStream("lib/txt/a.txt");
        //д
        FileOutputStream fos = new FileOutputStream("lib/directory/a.txt");
        //����
//        long startTime = System.currentTimeMillis();
        int b;
        while ((b = fis.read()) != -1){
            fos.write(b);
        }
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime-startTime+"ms");
        //�ͷ���Դ -- �ȿ��ĺ�ر�
        fos.close();
        fis.close();
    }
}
