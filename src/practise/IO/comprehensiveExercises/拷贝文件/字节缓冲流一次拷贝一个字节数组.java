package practise.IO.comprehensiveExercises.�����ļ�;

import java.io.*;

public class �ֽڻ�����һ�ο���һ���ֽ����� {
    public static void main(String[] args) throws IOException {
        //�����ֽڻ���������
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("lib/txt/a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lib/dest/a.txt"));
        //����
        int len;
        byte[] bytes = new byte[1024*1024*5];
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        //�ͷ���Դ
        bos.close();
        bis.close();
    }
}
