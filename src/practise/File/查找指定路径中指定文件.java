package practise.File;

import java.io.File;

public class ����ָ��·����ָ���ļ� {
    public static void main(String[] args) {
        File f1 = new File("aaa");
        System.out.println(containsAvi(f1));
    }

    public static boolean containsAvi(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile() && file.getName().endsWith(".avi"))
                return true;
        }
        return false;
    }
}
