package practise.File;

import java.io.File;

public class ���ҵ���ָ���ļ� {
    public static void main(String[] args) {
        findAvi();
    }

    public static void findAvi(){
        File[] disks = File.listRoots();
        for (File disk : disks) {
            findAvi(disk);
        }
    }

    public static void findAvi(File src) {
        //1.�����ļ���
        File[] files = src.listFiles();
        //2.�����ļ���
        //listFiles()���������ļ���Ȩ�޷���ʱҲ���������д���null
        if (files != null) {
            for (File file1 : files) {
                //3.�жϣ�������ļ� -- �ж�
                if (file1.isFile() && file1.getName().endsWith(".sql")) {
                    System.out.println(file1);
                }
                //4.�жϣ�������ļ��� -- �ݹ�
                else {
                    findAvi(file1);
                }
            }
        }
    }
}
