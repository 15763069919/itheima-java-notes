package practise.File;

import java.io.File;
import java.math.BigInteger;

public class 统计文件夹大小 {
    //参数要定义在外部，否则递归会重置
    static long len = 0;
    static BigInteger bi = new BigInteger("0");

    public static void main(String[] args) {
        System.out.println(getLen1(new File("src")));
        System.out.println(getLen2(new File("src")));
    }

    public static long getLen1(File src) {
        //1记录大小
        //2进入文件夹
        File[] files = src.listFiles();
        //3遍历数组
        for (File file : files) {
            //4如果是文件
            if (file.isFile()) {
                len += file.length();
            } else {
                //递归
                getLen1(file);
            }
        }
        return len;
    }

    public static String getLen2(File src) {
        //打开文件夹
        File[] files = src.listFiles();
        //遍历数组
        for (File file : files) {
            //如果是文件 -- 累加
            if (file.isFile())
                bi = bi.add(new BigInteger(file.length() + ""));
            //如果是文件夹 -- 递归
            else
                getLen2(file);
        }
        return bi.toString();
    }
}
