package practise.IO.�����.FileOutputStream.����������ݵķ�ʽ;

import java.io.FileOutputStream;
import java.io.IOException;

public class һ��дһ���ֽ�����Ĳ������� {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("lib/txt/a.txt");
        byte[] bytes = {97,98,99,100,101,102,103};
        file.write(bytes,1,4);
    }
}
