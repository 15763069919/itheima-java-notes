package practise.IO.������.FileReader;

import java.io.FileReader;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("lib/txt/a.txt");
        int len;
        char[] chars = new char[2];
        while ((len = fr.read(chars)) != -1){
            //������ת���ַ����ٽ��д�ӡ
            System.out.print(new String(chars,0,len));
        }
        //�ͷ���Դ
        fr.close();
    }
}
