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
            //读取
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);//最后一次可能装不满

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos != null) {
                try {
                    //释放资源
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    //释放资源
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
