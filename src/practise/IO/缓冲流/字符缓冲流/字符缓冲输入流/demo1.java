package practise.IO.������.�ַ�������.�ַ�����������;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        //1. �����ַ������������Ķ���
        BufferedReader br = new BufferedReader(new FileReader("lib/txt/a.txt"));
        //2.���з��� -- ��ȡ��������
        //�����س����н����������ȡ�س����е��ڴ���
        /*String line = br.readLine();
        System.out.println(line);*/

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        //3.�ͷ���Դ
        br.close();
    }
}
