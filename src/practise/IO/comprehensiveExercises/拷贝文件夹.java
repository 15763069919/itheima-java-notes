package practise.IO.comprehensiveExercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 拷贝文件夹 {
    public static void main(String[] args) throws IOException {
        File src = new File("lib/directory/666");
        File desc = new File("lib/directory/111/666");


        copyFile(src, desc);
    }

    /*  copyFile拷贝
     * 参数一：要拷贝的文件夹
     * 参数二：目的地
     * */
    public static void copyFile(File src, File dest) throws IOException {
        //在目的地创建文件夹
        dest.mkdirs();
        //进入数据源
        File[] files = src.listFiles();
        if (files != null) {    //文件不存在、带有权限的文件夹 -- 非空判断
            //遍历数组
            for (File file : files) {
                //如果是文件 -- 拷贝
                if (file.isFile()) {
                    //读取文件
                    FileInputStream fis = new FileInputStream(file);
                    //写入文件  文件--文件
                    FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));
                    //拷贝
                    int len;
                    byte[] bytes = new byte[1024 * 1024 * 5];
                    while ((len = fis.read(bytes)) != -1) {
                        fos.write(bytes);
                    }
                } else {
                    /*
                     * 参数一：要拷贝的文件
                     * 参数二：要拷贝到文件里面
                     * */
                    copyFile(file, new File(dest, file.getName()));
                }
            }
        }
    }
}
