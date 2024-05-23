package practise.File.File��Ա����;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class demo5 {
    public static void main(String[] args) {
        /*
        file�ĳ�����Ա��������ȡ��������
            �������� ˵��
            public static file[] listRoots() �г����õ��ļ�ϵͳ��
            public string[] list() ��ȡ��ǰ��·������������
            public string[] list(fileNameFilter filter) �����ļ�����������ȡ��ǰ��·������������
            public file[] [] listFiles() �ص����� ��ȡ��ǰ��·������������
            public file[] listFiles(fileFilter filter) �����ļ�����������ȡ��ǰ��·������������
            public file[] listFiles(fileNameFilter filter) �����ļ�����������ȡ��ǰ��·������������
         */

        //listRoots()   ��ȡ�����̷�
        File[] files = File.listRoots();
        System.out.println(Arrays.toString(files));

        System.out.println("==========================");


        //public string[] list() ��ȡ��ǰ��·������������
        File f1 = new File("lib/directory");
        String[] list2 = f1.list();
        for (String s : list2) {
            System.out.println(s);
        }

        System.out.println("---------------------------");

        //public string[] list(fileNameFilter filter) �����ļ�����������ȡ��ǰ��·������������
        String[] list = f1.list(new FilenameFilter() {
            /**
             * @param dir  the directory in which the file was found.
             * @param name the name of the file.
             * @return
             */
            /*
             * �βΣ���ʾ·����ÿһ���ļ����ļ��е�·��
             * �β�һ����ʾ����·��
             * �βζ�����ʾ�Ӽ�·��
             * ����ֵ��true��ʾ��ǰ·�����������������У�false��ʾ��ǰ·����������������������
             */
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
//                System.out.println(src);
                return src.isFile() && name.endsWith(".txt");
            }
        });
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("==========================");

        //�ص����գ�
        //��ȡָ����׺���ļ�
        File[] files1 = f1.listFiles();
        for (File file : files1) {
            if (file.isFile() && file.toString().endsWith(".txt"))
                System.out.println(file);
        }

        File[] files2 = f1.listFiles();

        System.out.println("==========================");


        //public file[] listFiles(fileFilter filter) �����ļ�����������ȡ��ǰ��·������������

        File[] files3 = f1.listFiles(new FileFilter() {
            /**
             *  accept�����Ĳ��������α�ʾ�ļ��������ÿһ���ļ����У���·�� -- ����·��
             */
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile()&&pathname.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(files3));

        //public file[] listFiles(fileNameFilter filter) �����ļ�����������ȡ��ǰ��·������������
        File[] files4 = f1.listFiles(new FilenameFilter() {
            /**
             * @param dir �������ҵ��ļ���Ŀ¼��
             * @param name �ļ������ơ�
             * @return
             */

            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);

                return src.isFile() && src.getName().endsWith(".txt");
            }
        });
        System.out.println(files4);

    }
}
