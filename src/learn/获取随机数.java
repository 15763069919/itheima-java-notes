package learn;

import  java.util.Random;   //导包 -- Random这个类在哪

public class 获取随机数 {
    public static void main(String[] args) {

        Random r = new Random();    //创建对象 -- 表示我现在要开始用Random这个类了
        int number = r.nextInt(1-10);   //生成随机数 -- 真正开始干活了(括号里面填生成随机数的范围)


    }
}
