package practise.IO.ת����.����1ָ���ַ�����д;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ����ָ������д������ {
    public static void main(String[] args) throws IOException {
        //��ʱ
        /*OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("lib/txt/Chinese.txt"),"GBK");
        osw.write("��ú����");
        osw.close();*/

        //���
        FileWriter fw = new FileWriter("lib/txt/Chinese.txt", Charset.forName("GBK"));
        fw.write("��ø���");
        fw.close();

    }
}
