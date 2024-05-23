package practise.IO.ת����.����1ָ���ַ�����д;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class �������ļ���GBK�ļ�ת����UTF8�ļ� {
    public static void main(String[] args) throws IOException {

        //��ʱ�ķ���
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("lib/txt/Chinese.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("lib/txt/ChineseUTF8.txt"),"UTF-8");
        int ch;
        while ((ch = isr.read()) != -1){
            osw.write(ch);
        }
        osw.close();
        isr.close();*/

        //ʹ��GBK��ȡ�ļ�
        FileReader fr = new FileReader("lib/txt/Chinese.txt", Charset.forName("GBK"));
        //ʹ��UTF-8д���ļ�
        FileWriter fw = new FileWriter("lib/txt/ChineseUTF8.txt", Charset.forName("UTF-8"));
        int ch;
        while((ch = fr.read()) != -1){
            fw.write(ch);
        }
        fw.close();
        fr.close();






    }
}
