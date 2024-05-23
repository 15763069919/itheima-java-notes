package practise.IO.��ѹ����.ѹ����.��д;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ѹ���ļ���2 {

    public static void main(String[] args) throws IOException {
        //����File�����ʾ�ļ���
        File src = new File("lib/zip/demo");
        //����File�����ʾ�ļ��и�·��
        File destParent = src.getParentFile();
        //����File�����ʾѹ��
        File dest = new File(destParent, src.getName() + ".zip");
//        System.out.println(dest);
        //����ѹ��������ѹ����
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //ѹ��
        toZip4(src, zos);
        //����
        zos.close();

    }

    private static void toZip4(File src, ZipOutputStream zos) throws IOException {
        //1.���ļ�
        File[] files = src.listFiles();
        System.out.println("------------fires--------------");
        for (File file : files) {
            System.out.println(file);
        }
        System.out.println("-------------------------------");
        //2.��������
        for (File file : files) {
            //3.�ж�
            System.out.println("=================================================");

            //������ļ� -- ����ZipEntry����
            if (file.isFile()) {
                //����ZipEntry����
                ZipEntry entry = new ZipEntry(src.getName() + "/" + file.getName());
//                System.out.println("--------------fire.getName()------------");
//                System.out.println(file.getName());
                System.out.println("--------------src.getName()-------------");
                System.out.println(src.getName());
                System.out.println("----------------------------------------");

                //��ӵ�ѹ����
                zos.putNextEntry(entry);
                //��������
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1) {
                    zos.write(b);
                }
                //�رձ���Entry��
                fis.close();
                zos.closeEntry();
            }
            //������ļ��� -- �ݹ�
            else {
                toZip4(file, zos);
            }
        }
    }

}
