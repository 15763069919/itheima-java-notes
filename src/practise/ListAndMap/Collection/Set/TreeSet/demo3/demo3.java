package practise.ListAndMap.Collection.Set.TreeSet.demo3;

import java.util.TreeSet;

public class demo3 {
    public static void main(String[] args) {

       /* TreeSet<String> ts = new TreeSet<>();
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts);*/


        //�Ƚ�������
        //o1:��ǰҪ��ӵ�Ԫ��
        //02������ӵ�Ԫ��
        //����ֵ����֮ǰһ��
        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
            //����������
            int i = o1.length() - o2.length();
            //�������һ��������ĸ����
            i = i == 0 ? o1.compareTo(o2) : i;
            return i;

        });

        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts);

    }
}
