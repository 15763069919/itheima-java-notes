package practise.IO.解压缩流.压缩流.重写;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class 压缩单文件 {
    public static void main(String[] args) throws IOException {
        //1.创建File对象表示文件路径
        File src = new File("lib/zip/demo1.txt");
        //2.创建Fil对象表示压缩包路径
        File dest = new File("lib/zip");
        //压缩
        toZip3(src,dest);
    }

    private static void toZip3(File src, File dest) throws IOException {
        //创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,src.getName()+".zip")));
        //创建ZipEntry对象
        ZipEntry entry = new ZipEntry(src.getName());
        //将ZipEntry对象添加进压缩包
        zos.putNextEntry(entry);
        //数据拷贝 -- 从数据源拷贝数据到压缩包中的ZipEntry对象
        FileInputStream fis = new FileInputStream(src);
        int b;
        while((b = fis.read()) != -1){
            zos.write(b);
        }
        //关流
        fis.close();
        zos.closeEntry();
        zos.close();


    }
}
