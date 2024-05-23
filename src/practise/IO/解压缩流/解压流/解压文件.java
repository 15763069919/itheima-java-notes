package practise.IO.解压缩流.解压流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class 解压文件 {
    public static void main(String[] args) throws IOException {
        //1.创建文件对象表示要解压的压缩包
        File src = new File("lib/zip/APP2.zip");
        //2.创建文件对象表示解压的目的地
        File dest = new File("lib/zip");
        File src2 = new File("lib/zip/APP.zip");
        //2.创建文件对象表示解压的目的地
        File dest2 = new File("lib/zip");

        unzip(src, dest);
        unzip(src2, dest2);
    }

    //定义一个方法用来解压
    /**
     * 参数一：解压的压缩包       参数二：解压的目的地
     **/
    public static void unzip(File src, File dest) throws IOException {
        //解压的本质：把压缩包中的每一个文件或者文件夹读出来，按照层级拷贝到目的地中
        //1.创建解压流用来读取压缩包中的数据
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        //2.获取压缩包中每一个ZipEntry对象
        //3.表示当前在压缩包中获取到的文件或文件夹
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null) {
            //文件夹：在目的地出创建一个文件夹
            if (entry.isDirectory()) {
                File file = new File(dest, entry.toString());
                System.out.println(file.mkdirs());
            }
            //文件：读取并拷贝
            else {
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.toString()));
                int b;
                while ((b = zip.read()) != -1) {
                    //写到目的地
                    fos.write(b);
                }
                fos.close();
                //在压缩包中的一个文件处理完毕了
                zip.closeEntry();
            }
        }
        zip.close();
    }
}