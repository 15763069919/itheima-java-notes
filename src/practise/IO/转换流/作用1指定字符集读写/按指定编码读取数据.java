package practise.IO.ת����.����1ָ���ַ�����д;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ��ָ�������ȡ���� {
    public static void main(String[] args) throws IOException {
        //��ʱ
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("lib/txt/Chinese.txt"),"GBK");
        int ch;
        while ((ch = isr.read()) != -1){
            System.out.print((char)ch);
        }
        isr.close();*/

        //�������
        FileReader fr = new FileReader("lib/txt/Chinese.txt", Charset.forName("GBK"));
        int ch;
        while ((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }

    }
}
