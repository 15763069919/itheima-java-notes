package practise.File;

import java.io.File;

public class 删除含有文件的文件夹 {
    public static void main(String[] args) {
        deleteDir(new File("aaa"));
    }

    public static void deleteDir(File src) {
        //进入文件
        File[] files = src.listFiles();
        //遍历
        for (File file : files) {
            //如果是文件-- 删除
            if (file.isFile()) {
                file.delete();
            }else {
                //如果文件夹 -- 递归
                deleteDir(file);
            }
        }


        src.delete();
    }
}

