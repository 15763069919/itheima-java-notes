package practise.File;

import java.io.File;
import java.io.IOException;

public class �����ļ��кʹ��ļ����µ��ļ� {
    public static void main(String[] args) throws IOException {
        File f1 = new File("aaa");
        System.out.println(f1.mkdirs());
        File f2 = new File(f1,"a.txt");
        System.out.println(f2.createNewFile());
    }
}
