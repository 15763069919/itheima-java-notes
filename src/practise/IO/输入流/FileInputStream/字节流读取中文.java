package practise.IO.������.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class �ֽ�����ȡ���� {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("lib/txt/a.txt");
        int b;  //��¼ÿһ���ֽ�����
        while ((b = fis.read()) != -1){
            System.out.println((char)b);
        }
        fis.close();
    }
}
