package practise.File.File��Ա����;

import java.io.File;

public class demo4 {
    public static void main(String[] args) {
        //listFiles()   ��ȡ�ļ����µ���������
        File f1 = new File("lib");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
