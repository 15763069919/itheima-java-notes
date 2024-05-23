package practise.IO.解压缩流.压缩流.重写;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class 压缩文件夹2 {

    public static void main(String[] args) throws IOException {
        //创建File对象表示文件夹
        File src = new File("lib/zip/demo");
        //创建File对象表示文件夹父路径
        File destParent = src.getParentFile();
        //创建File对象表示压缩
        File dest = new File(destParent, src.getName() + ".zip");
//        System.out.println(dest);
        //创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //压缩
        toZip4(src, zos);
        //关流
        zos.close();

    }

    private static void toZip4(File src, ZipOutputStream zos) throws IOException {
        //1.打开文件
        File[] files = src.listFiles();
        System.out.println("------------fires--------------");
        for (File file : files) {
            System.out.println(file);
        }
        System.out.println("-------------------------------");
        //2.遍历数组
        for (File file : files) {
            //3.判断
            System.out.println("=================================================");

            //如果是文件 -- 创建ZipEntry对象
            if (file.isFile()) {
                //创建ZipEntry对象
                ZipEntry entry = new ZipEntry(src.getName() + "/" + file.getName());
//                System.out.println("--------------fire.getName()------------");
//                System.out.println(file.getName());
                System.out.println("--------------src.getName()-------------");
                System.out.println(src.getName());
                System.out.println("----------------------------------------");

                //添加到压缩流
                zos.putNextEntry(entry);
                //拷贝数据
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1) {
                    zos.write(b);
                }
                //关闭本个Entry流
                fis.close();
                zos.closeEntry();
            }
            //如果是文件夹 -- 递归
            else {
                toZip4(file, zos);
            }
        }
    }

}
