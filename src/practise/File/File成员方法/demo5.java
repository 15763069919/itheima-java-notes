package practise.File.File成员方法;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class demo5 {
    public static void main(String[] args) {
        /*
        file的常见成员方法（获取并遍历）
            方法名称 说明
            public static file[] listRoots() 列出可用的文件系统根
            public string[] list() 获取当前该路径下所有内容
            public string[] list(fileNameFilter filter) 利用文件名过滤器获取当前该路径下所有内容
            public file[] [] listFiles() 重点掌握 获取当前该路径下所有内容
            public file[] listFiles(fileFilter filter) 利用文件名过滤器获取当前该路径下所有内容
            public file[] listFiles(fileNameFilter filter) 利用文件名过滤器获取当前该路径下所有内容
         */

        //listRoots()   获取电脑盘符
        File[] files = File.listRoots();
        System.out.println(Arrays.toString(files));

        System.out.println("==========================");


        //public string[] list() 获取当前该路径下所有内容
        File f1 = new File("lib/directory");
        String[] list2 = f1.list();
        for (String s : list2) {
            System.out.println(s);
        }

        System.out.println("---------------------------");

        //public string[] list(fileNameFilter filter) 利用文件名过滤器获取当前该路径下所有内容
        String[] list = f1.list(new FilenameFilter() {
            /**
             * @param dir  the directory in which the file was found.
             * @param name the name of the file.
             * @return
             */
            /*
             * 形参：表示路径中每一个文件或文件夹的路径
             * 形参一：表示父级路径
             * 形参二：表示子级路径
             * 返回值：true表示当前路径保留，放入数组中，false表示当前路径不保留，不放入数组中
             */
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
//                System.out.println(src);
                return src.isFile() && name.endsWith(".txt");
            }
        });
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("==========================");

        //重点掌握：
        //获取指定后缀的文件
        File[] files1 = f1.listFiles();
        for (File file : files1) {
            if (file.isFile() && file.toString().endsWith(".txt"))
                System.out.println(file);
        }

        File[] files2 = f1.listFiles();

        System.out.println("==========================");


        //public file[] listFiles(fileFilter filter) 利用文件名过滤器获取当前该路径下所有内容

        File[] files3 = f1.listFiles(new FileFilter() {
            /**
             *  accept方法的参数是依次表示文件夹里面的每一个文件（夹）的路径 -- 完整路径
             */
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile()&&pathname.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(files3));

        //public file[] listFiles(fileNameFilter filter) 利用文件名过滤器获取当前该路径下所有内容
        File[] files4 = f1.listFiles(new FilenameFilter() {
            /**
             * @param dir 在其中找到文件的目录。
             * @param name 文件的名称。
             * @return
             */

            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);

                return src.isFile() && src.getName().endsWith(".txt");
            }
        });
        System.out.println(files4);

    }
}
