package practise.ComprehensiveExercise.Set;

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"zhangsan","lisi","wnagwu","zhaoliu","zhengqi","chenba","dujiu","sunshi");

        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
