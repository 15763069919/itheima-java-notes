package practise.StringJoiner;

import java.util.StringJoiner;

public class Demo2 {
    public static void main(String[] args) {
        //1.��������
        StringJoiner sj = new StringJoiner(",","[","]");

        //2.���Ԫ��
        sj.add("aaa").add("bbb.txt").add("ccc");

        //3.��ӡ
        System.out.println(sj);

        String string = sj.toString();
        System.out.println(string);
    }
}
