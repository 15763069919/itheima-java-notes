package practise.IO.thirdPartyJar.HutoolIO;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class demo1 {
    public static void main(String[] args) {
        File file = FileUtil.file("lib", "/txt", "/txt","/b.txt");//D:\Work\JAVA\IdeaCode\itheima\itheima\out\production\itheima\lib\txt\txt\b.txt
        System.out.println(file);

        File touch = FileUtil.touch(file);
        System.out.println(touch);

    }
}
