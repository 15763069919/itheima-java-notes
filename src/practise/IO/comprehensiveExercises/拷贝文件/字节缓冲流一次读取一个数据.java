package practise.IO.comprehensiveExercises.�����ļ�;

import java.io.*;

public class �ֽڻ�����һ�ζ�ȡһ������ {
    public static void main(String[] args) throws IOException {
        //�����ֽڻ������Ķ���
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("lib/txt/a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lib/dest/a.txt"));
        //����
        int b;
        while((b = bis.read()) != -1){
            bos.write(b);
        }
        //�ͷ���Դ
        bos.close();
        bis.close();
    }
}
