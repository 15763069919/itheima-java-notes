package practise.File.File���췽��;

import java.io.File;

public class demo1 {
    public static void main(String[] args) {
        //1.�����ļ�·�������ļ�����
        String str = "lib/txt/a.txt";
        //���ַ���תΪFile�Ķ���
        File f1 = new File(str);
        System.out.println(f1);
        //ʹ��File����ķ���


        //2. ���ݸ�·�����ַ�������·�����ַ��������ļ�����
        //��·����lib/txt/
        //��·����a.txt
        String parent = "lib/txt/";
        String child = "a.txt";
        File f2 = new File(parent,child);
        System.out.println(f2);

        //3.��һ��File��ʾ��·����String��ʾ��·������ƴ��
        File parent2 = new File("lib/txt/");
        String child2 = "a.txt";
        File f3 = new File(parent2,child2);
        System.out.println(f3);
    }
}
