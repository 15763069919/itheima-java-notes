package practise.IO.�����.FileOutputStream.����������ݵķ�ʽ;

import java.io.FileOutputStream;
import java.io.IOException;

public class һ��дһ���ֽ��������� {
    public static void main(String[] args) throws IOException {
        //1����������
        FileOutputStream fos = new FileOutputStream("lib/txt/a.txt");
        byte[] bytes = {97,98,99};
        fos.write(bytes);


        //3. �ͷ���Դ
        fos.close();
    }
}
