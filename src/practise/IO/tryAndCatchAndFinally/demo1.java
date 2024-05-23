package practise.IO.tryAndCatchAndFinally;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("lib/txt/a.txt");
            fos = new FileOutputStream("lib/directory/a.txt");
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            //��ȡ
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);//���һ�ο���װ����

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos != null) {
                try {
                    //�ͷ���Դ
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    //�ͷ���Դ
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
