package practise.File.File��Ա����;

import java.io.File;
import java.io.IOException;

public class demo3 {
    public static void main(String[] args) throws IOException {
//        File f1 = new File("lib/txt/a.txt");

        //createNewFile()
        //�ļ������ڴ����ɹ�����true���ļ����ڴ���ʧ�ܷ���false
        //�������·�������ڣ������쳣 -- ioException
        File f2 = new File("lib/txt/b.txt");
        boolean newFile = f2.createNewFile();
        System.out.println(newFile);

        File f3 = new File("lib/txt/c");
        boolean newFile1 = f3.createNewFile();
        System.out.println(newFile1);

        //mkdir() ���������ļ���
        File f4 = new File("lib/directory/bb");
        boolean mkdir = f4.mkdir();
        System.out.println(mkdir);

        File f5 = new File("lib/directory/dd/ee");
        boolean mkdir1 = f5.mkdir();
        System.out.println(mkdir1);

        //mkdirs() ���������ļ���
        File f6 = new File("lib/directory/dd/ee");
        boolean mkdir2 = f6.mkdirs();
        System.out.println(mkdir2);


        //delete() ɾ���ļ������ļ���    ���߻���վ
        File f7 = new File("lib/directory/aaa.txt");
        boolean delete = f7.delete();
        System.out.println(delete);

        File f8 = new File("lib/directory/ff");
        boolean delete1 = f8.delete();
        System.out.println(delete1);

        File f9 = new File("lib/directory/gg");
        boolean delete2 = f9.delete();
        System.out.println(delete2);

    }
}
