package practise.IO.��ѹ����.ѹ����;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ѹ�����ļ� {
    public static void main(String[] args) throws IOException {
        //����File�����ʾҪѹ�����ļ�
        File src = new File("lib/zip/demo1.txt");
        //...
        File dest = new File("lib/zip");
        toZip(src, dest);
    }

    /**
     * ����һ��Ҫѹ�����ļ�
     * ��������ѹ������λ��
     */
    public static void toZip(File src, File dest) throws IOException {
        //1.����ѹ��������ѹ����
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"demo1.zip")));
        //2.����ZipEntry���󣬱�ʾѹ���������ÿһ��ѹ�������ļ���
        ZipEntry entry = new ZipEntry("demo1.txt");
        //3.��ZipEntry�Ž�ѹ������
        zos.putNextEntry(entry);
        //4.��src�ļ��е�����д��ѹ������
        FileInputStream fis = new FileInputStream(src);
        int b;
        while((b = fis.read())!= -1){
         zos.write(b);
        }
        fis.close();
        zos.closeEntry();
        zos.close();

    }
}
