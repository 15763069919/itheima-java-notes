package practise.IO.������.�ַ�������.�ַ����������;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        //1.�����ֽڻ���������Ķ���
        BufferedWriter bw = new BufferedWriter(new FileWriter("lib/txt/b.txt",true));
        //2.д������
        bw.write("�������������Ӱٶ���������");
        //����
        bw.newLine();
        bw.write("��������");
        bw.newLine();
        //3.�ͷ���Դ
        bw.close();
    }
}
