package practise.IO.comprehensiveExercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class �����ļ��� {
    public static void main(String[] args) throws IOException {
        File src = new File("lib/directory/666");
        File desc = new File("lib/directory/111/666");


        copyFile(src, desc);
    }

    /*  copyFile����
     * ����һ��Ҫ�������ļ���
     * ��������Ŀ�ĵ�
     * */
    public static void copyFile(File src, File dest) throws IOException {
        //��Ŀ�ĵش����ļ���
        dest.mkdirs();
        //��������Դ
        File[] files = src.listFiles();
        if (files != null) {    //�ļ������ڡ�����Ȩ�޵��ļ��� -- �ǿ��ж�
            //��������
            for (File file : files) {
                //������ļ� -- ����
                if (file.isFile()) {
                    //��ȡ�ļ�
                    FileInputStream fis = new FileInputStream(file);
                    //д���ļ�  �ļ�--�ļ�
                    FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));
                    //����
                    int len;
                    byte[] bytes = new byte[1024 * 1024 * 5];
                    while ((len = fis.read(bytes)) != -1) {
                        fos.write(bytes);
                    }
                } else {
                    /*
                     * ����һ��Ҫ�������ļ�
                     * ��������Ҫ�������ļ�����
                     * */
                    copyFile(file, new File(dest, file.getName()));
                }
            }
        }
    }
}
