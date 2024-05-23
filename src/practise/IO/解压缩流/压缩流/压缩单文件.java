package practise.IO.解压缩流.压缩流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class 压缩单文件 {
    public static void main(String[] args) throws IOException {
        //创建File对象表示要压缩的文件
        File src = new File("lib/zip/demo1.txt");
        //...
        File dest = new File("lib/zip");
        toZip(src, dest);
    }

    /**
     * 参数一：要压缩的文件
     * 参数二：压缩包的位置
     */
    public static void toZip(File src, File dest) throws IOException {
        //1.创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"demo1.zip")));
        //2.创建ZipEntry对象，表示压缩包里面的每一个压缩包和文件夹
        ZipEntry entry = new ZipEntry("demo1.txt");
        //3.把ZipEntry放进压缩包中
        zos.putNextEntry(entry);
        //4.把src文件中的数据写入压缩包中
        FileInputStream fis = new FileInputStream(src);
        int b;
        while((b = fis.read())!= -1){
         zos.write(b);
        }
        fis.close();
        zos.closeEntry();
        zos.close();

    }
}
