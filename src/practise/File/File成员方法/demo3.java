package practise.File.File成员方法;

import java.io.File;
import java.io.IOException;

public class demo3 {
    public static void main(String[] args) throws IOException {
//        File f1 = new File("lib/txt/a.txt");

        //createNewFile()
        //文件不存在创建成功返回true，文件存在创建失败返回false
        //如果父级路径不存在，会有异常 -- ioException
        File f2 = new File("lib/txt/b.txt");
        boolean newFile = f2.createNewFile();
        System.out.println(newFile);

        File f3 = new File("lib/txt/c");
        boolean newFile1 = f3.createNewFile();
        System.out.println(newFile1);

        //mkdir() 创建单极文件夹
        File f4 = new File("lib/directory/bb");
        boolean mkdir = f4.mkdir();
        System.out.println(mkdir);

        File f5 = new File("lib/directory/dd/ee");
        boolean mkdir1 = f5.mkdir();
        System.out.println(mkdir1);

        //mkdirs() 创建单极文件夹
        File f6 = new File("lib/directory/dd/ee");
        boolean mkdir2 = f6.mkdirs();
        System.out.println(mkdir2);


        //delete() 删除文件、空文件夹    不走回收站
        File f7 = new File("lib/directory/aaa.txt");
        boolean delete = f7.delete();
        System.out.println(delete);

        File f8 = new File("lib/directory/ff");
        boolean delete1 = f8.delete();
        System.out.println(delete1);

        File f9 = new File("lib/directory/gg");
        boolean delete2 = f9.delete();
        System.out.println(delete2);

    }
}
