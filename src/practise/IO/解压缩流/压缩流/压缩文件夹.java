package practise.IO.��ѹ����.ѹ����;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class ѹ���ļ��� {
    public static void main(String[] args) throws IOException {
        //1.����File�����ʾ�ļ���
        File src = new File("lib/zip/a");
        //2.����File�����ʾѹ�����������ѹ��������·����
        File destParent = src.getParentFile();
        //3.����File�����ʾѹ������·��
        File dest = new File(destParent, src.getName() + ".zip");
        //4.����ѹ��������ѹ����
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //5.��ȡsrc�����ÿһ���ļ������ZipEntry���󣬷��뵽ѹ��������
        //ѹ��
        toZip2(src, zos, src.getName());
        //6.�ͷ���Դ
        zos.close();
    }
    /*
     * ���ã���ȡsrc�����ÿһ���ļ������ZipEntry���󣬷��뵽ѹ��������
     * ����һ������Դ
     * ��������ѹ����
     * ��������ѹ�����ڲ���·��
     * */

    private static void toZip2(File src, ZipOutputStream zos, String name) throws IOException {
        //1.����src�ļ���
        File[] files = src.listFiles();
        //2.��������
        for (File file : files) {
            //3.�ж�
            //������ļ� -- ���ZipEntry���󣬷��뵽ѹ������
            if (file.isFile()) {
                ZipEntry entry = new ZipEntry(name+"\\"+file.getName());
                System.out.println(file.getName());
                zos.putNextEntry(entry);
                //��ȡ�ļ��е����ݣ�д��ѹ����
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1) {
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            }
            //������ļ��� -- �ݹ�
            else {
                toZip2(file,zos,name+"\\"+file.getName());
            }

        }


    }
}
