package practise.IO.ת����.����2�ֽ���ʹ���ַ����ķ���;

import java.io.*;

public class demo1 {
    public static void main(String[] args) throws IOException {
        /*
        * �����ֽ�����ȡ�ļ��е����ݣ�ÿ�ζ�һ�У����Ҳ��ܳ�������
        *
        * 1.��ȡ���ģ��ֽ��� -- ���룬�ַ��� -- ������
        * 2.��ȡһ�У��ֽ��� -- ���ܣ��ַ������� -- ��
        * */

        //�����ֽ�������
        FileInputStream fis = new FileInputStream("lib/txt/a.txt");
        //����ת�������󣬽��ֽ�����װ���ַ������ж�ȡ����ֹ��ȡ����
        InputStreamReader isr = new InputStreamReader(fis);
        //�����ַ����������󣬽��ַ�����װ���ַ���������ʹ�ܹ�һ�ζ�ȡһ��
        BufferedReader br = new BufferedReader(isr);

       /* ���Լ򻯳ɣ�
        * BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream("lib/txt/a.txt")));
        */

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
