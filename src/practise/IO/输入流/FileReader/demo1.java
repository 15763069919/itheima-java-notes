package practise.IO.������.FileReader;

import java.io.FileReader;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        //1.��������
        FileReader fr = new FileReader("lib/txt/a.txt");
        //2.��ȡ����
        /*�ַ����ĵײ�Ҳ���ֽ�����Ĭ��Ҳ��һ���ֽ�һ���ֽڵĶ�ȡ��
        �����������ľͻ�һ�ζ�ȡ�����GBKһ�ζ�ȡ�����ֽڣ�UTF-8һ�ζ�ȡ�����ֽ�
        */
        /*
        * read()������ϸ�ڣ�
        *           1.Ĭ��Ҳ��һ���ֽ�һ���ֽڽ��ж�ȡ�ģ�����������ľͻ�һ�ζ�ȡ���
        *           2.�ڶ�ȡ֮�󣬷����ĵײ㻹����н��벢ת��ʮ���ơ����հ����ʮ������Ϊ����ֵ
        *               ���ʮ���Ƶ�����Ҳ��ʾ���ַ����ϵ�����
        *   Ӣ�ģ�0110 0001  read()������ȡ�������ת��ʮ����97
        *   ���ģ�11100110 10110001 10001001   read()��ȡ�������ת��ʮ����27721
        * */
        int ch;
        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }
        //�ͷ���Դ
        fr.close();
    }
}
