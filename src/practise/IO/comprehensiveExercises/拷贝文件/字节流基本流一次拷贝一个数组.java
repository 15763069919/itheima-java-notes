package practise.IO.comprehensiveExercises.�����ļ�;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class �ֽ���������һ�ο���һ������ {
    public static void main(String[] args) throws IOException {
        //�����ֽ�������
        FileInputStream fis = new FileInputStream("lib/txt/a.txt");
        FileOutputStream fos = new FileOutputStream("lib/dest/a.txt");
        int b;
        while((b = fis.read()) != -1){
            fos.write(b);
        }
        //�ͷ���Դ
        fos.close();
        fis.close();
    }
}
