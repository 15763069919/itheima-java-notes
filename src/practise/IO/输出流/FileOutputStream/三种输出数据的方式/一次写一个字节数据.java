package practise.IO.�����.FileOutputStream.����������ݵķ�ʽ;

import java.io.FileOutputStream;
import java.io.IOException;

public class һ��дһ���ֽ����� {
    public static void main(String[] args) throws IOException {
        //1.��������
        FileOutputStream fos = new FileOutputStream("lib/txt/a.txt");
        //д������
        fos.write(97);
        //�ͷ���Դ
        fos.close(); 
    }


}
