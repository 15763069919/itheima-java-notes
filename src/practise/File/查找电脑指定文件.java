package practise.File;

import java.io.File;

public class 查找电脑指定文件 {
    public static void main(String[] args) {
        findAvi();
    }

    public static void findAvi(){
        File[] disks = File.listRoots();
        for (File disk : disks) {
            findAvi(disk);
        }
    }

    public static void findAvi(File src) {
        //1.进入文件夹
        File[] files = src.listFiles();
        //2.遍历文件夹
        //listFiles()方法遇到文件无权限访问时也会在数组中存入null
        if (files != null) {
            for (File file1 : files) {
                //3.判断：如果是文件 -- 判断
                if (file1.isFile() && file1.getName().endsWith(".sql")) {
                    System.out.println(file1);
                }
                //4.判断：如果是文件夹 -- 递归
                else {
                    findAvi(file1);
                }
            }
        }
    }
}
