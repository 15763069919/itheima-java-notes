package practise.IO.������.�ֽڻ�����;

import java.io.*;

public class �ļ�����һ�ζ�ȡһ���ֽ� {
    public static void main(String[] args) throws IOException {
        //��������������
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("lib/txt/a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lib/directory/a.txt"));
        //ѭ����ȡ��д��Ŀ�ĵ�
        int b;
        while ((b = bis.read()) != -1){
            bos.write(b);
        }
        //�ͷ���Դ
        bos.close();
        bis.close();



    }
}
