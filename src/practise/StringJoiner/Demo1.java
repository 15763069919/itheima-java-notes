package practise.StringJoiner;

import java.util.StringJoiner;

public class Demo1 {
    public static void main(String[] args) {
        //1.����һ�����󣬲�ָ���м�ļ������
        StringJoiner sj = new StringJoiner("---");

        //2.���Ԫ��
        sj.add("aaa").add("bbb.txt").add("ccc");

        //3.��ӡ���
        System.out.println(sj);

    }
}
