package practise.StringJoiner;

import java.util.StringJoiner;

public class Demo2 {
    public static void main(String[] args) {
        //1.创建对象
        StringJoiner sj = new StringJoiner(",","[","]");

        //2.添加元素
        sj.add("aaa").add("bbb.txt").add("ccc");

        //3.打印
        System.out.println(sj);

        String string = sj.toString();
        System.out.println(string);
    }
}
