package practise.IO.comprehensiveExercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ���ļ����� {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("lib/txt/a.txt");
        FileOutputStream fos = new FileOutputStream("lib/directory/a.txt");
        //��ȡ
        int len;
        byte[] bytes = new byte[1024*1024*5];
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);//���һ�ο���װ����
        }
        //�ͷ���Դ
        fos.close();
        fis.close();
    }
}
