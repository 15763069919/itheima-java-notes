package practise.IO.comprehensiveExercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class �ļ����� {
    public static void main(String[] args) throws IOException {
        /*
        * ���ļ����ܲ�ͬ���ǣ�ֻ��Ҫ�޸Ĺ���������ļ�·������
        * */
        //1.�����������ԭʼ�ļ�
        FileInputStream fis = new FileInputStream("lib/txt/ency.txt");
        //2.����������������ļ�
        FileOutputStream fos = new FileOutputStream("lib/txt/a.txt");
        //3.�����ļ�
        int b;
        while((b = fis.read()) != -1){
            fos.write(b^2);
        }
        //4.�ͷ���Դ
        fos.close();
        fis.close();
    }
}
