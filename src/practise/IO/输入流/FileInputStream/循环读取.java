package practise.IO.������.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class ѭ����ȡ {
    public static void main(String[] args) throws IOException {
        //��������
        FileInputStream fis = new FileInputStream("lib/txt/a.txt");
        /*//ѭ����ȡ
        int b;//��¼��ȡ������
        while((b = fis.read())!=-1){ //��b��ֵ�����ж�b��Ϊ-1������֤û�ж�ȡ����β
            System.out.print((char)b);
        }
        //3.�ͷ���Դ
        fis.close();*/

        //����ʹ�ñ���b
        //дһ��fis.read()�ƶ�һ��ָ�룬һ��ѭ���ƶ�������
        while((fis.read())!=-1){ //��b��ֵ�����ж�b��Ϊ-1������֤û�ж�ȡ����β
            System.out.print((char)fis.read());
        }
        //3.�ͷ���Դ
        fis.close();
    }
}
