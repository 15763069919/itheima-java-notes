package practise.IO.������.�ֽڻ�����;

import java.io.*;

public class �ļ�����һ�ζ�ȡ����ֽ� {
    public static void main(String[] args) throws IOException {
        //1. �����������Ķ���
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("lib/txt/a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lib/directory/a.txt"));
        //2.����
        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        //3.�ͷ���Դ
        bos.close();
        bis.close();
    }
}
