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


        //比较器排序
        //o1:当前要添加的元素
        //02：已添加的元素
        //返回值，和之前一样
        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
            //按长度排序
            int i = o1.length() - o2.length();
            //如果长度一样按首字母排序
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
