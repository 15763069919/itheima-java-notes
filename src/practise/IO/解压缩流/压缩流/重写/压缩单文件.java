package practise.IO.��ѹ����.ѹ����.��д;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ѹ�����ļ� {
    public static void main(String[] args) throws IOException {
        //1.����File�����ʾ�ļ�·��
        File src = new File("lib/zip/demo1.txt");
        //2.����Fil�����ʾѹ����·��
        File dest = new File("lib/zip");
        //ѹ��
        toZip3(src,dest);
    }

    private static void toZip3(File src, File dest) throws IOException {
        //����ѹ��������ѹ����
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,src.getName()+".zip")));
        //����ZipEntry����
        ZipEntry entry = new ZipEntry(src.getName());
        //��ZipEntry������ӽ�ѹ����
        zos.putNextEntry(entry);
        //���ݿ��� -- ������Դ�������ݵ�ѹ�����е�ZipEntry����
        FileInputStream fis = new FileInputStream(src);
        int b;
        while((b = fis.read()) != -1){
            zos.write(b);
        }
        //����
        fis.close();
        zos.closeEntry();
        zos.close();


    }
}
