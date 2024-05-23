package practise.IO.��ѹ����.��ѹ��;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ��ѹ�ļ� {
    public static void main(String[] args) throws IOException {
        //1.�����ļ������ʾҪ��ѹ��ѹ����
        File src = new File("lib/zip/APP2.zip");
        //2.�����ļ������ʾ��ѹ��Ŀ�ĵ�
        File dest = new File("lib/zip");
        File src2 = new File("lib/zip/APP.zip");
        //2.�����ļ������ʾ��ѹ��Ŀ�ĵ�
        File dest2 = new File("lib/zip");

        unzip(src, dest);
        unzip(src2, dest2);
    }

    //����һ������������ѹ
    /**
     * ����һ����ѹ��ѹ����       ����������ѹ��Ŀ�ĵ�
     **/
    public static void unzip(File src, File dest) throws IOException {
        //��ѹ�ı��ʣ���ѹ�����е�ÿһ���ļ������ļ��ж����������ղ㼶������Ŀ�ĵ���
        //1.������ѹ��������ȡѹ�����е�����
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        //2.��ȡѹ������ÿһ��ZipEntry����
        //3.��ʾ��ǰ��ѹ�����л�ȡ�����ļ����ļ���
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null) {
            //�ļ��У���Ŀ�ĵس�����һ���ļ���
            if (entry.isDirectory()) {
                File file = new File(dest, entry.toString());
                System.out.println(file.mkdirs());
            }
            //�ļ�����ȡ������
            else {
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.toString()));
                int b;
                while ((b = zip.read()) != -1) {
                    //д��Ŀ�ĵ�
                    fos.write(b);
                }
                fos.close();
                //��ѹ�����е�һ���ļ����������
                zip.closeEntry();
            }
        }
        zip.close();
    }
}