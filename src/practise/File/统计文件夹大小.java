package practise.File;

import java.io.File;
import java.math.BigInteger;

public class ͳ���ļ��д�С {
    //����Ҫ�������ⲿ������ݹ������
    static long len = 0;
    static BigInteger bi = new BigInteger("0");

    public static void main(String[] args) {
        System.out.println(getLen1(new File("src")));
        System.out.println(getLen2(new File("src")));
    }

    public static long getLen1(File src) {
        //1��¼��С
        //2�����ļ���
        File[] files = src.listFiles();
        //3��������
        for (File file : files) {
            //4������ļ�
            if (file.isFile()) {
                len += file.length();
            } else {
                //�ݹ�
                getLen1(file);
            }
        }
        return len;
    }

    public static String getLen2(File src) {
        //���ļ���
        File[] files = src.listFiles();
        //��������
        for (File file : files) {
            //������ļ� -- �ۼ�
            if (file.isFile())
                bi = bi.add(new BigInteger(file.length() + ""));
            //������ļ��� -- �ݹ�
            else
                getLen2(file);
        }
        return bi.toString();
    }
}
