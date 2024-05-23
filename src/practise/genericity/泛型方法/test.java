package practise.genericity.·ºÐÍ·½·¨;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ListUtil.addAll(list1, "aaa", "bbb.txt", "ccc", "ddd");

        System.out.println(list1);
        ArrayList<Integer> list2 = new ArrayList<>();

        ListUtil.addAll(list2, 1, 2, 3, 4);
        System.out.println(list2);

    }


}

