package practise.File;

import java.io.File;

public class ɾ�������ļ����ļ��� {
    public static void main(String[] args) {
        deleteDir(new File("aaa"));
    }

    public static void deleteDir(File src) {
        //�����ļ�
        File[] files = src.listFiles();
        //����
        for (File file : files) {
            //������ļ�-- ɾ��
            if (file.isFile()) {
                file.delete();
            }else {
                //����ļ��� -- �ݹ�
                deleteDir(file);
            }
        }


        src.delete();
    }
}

