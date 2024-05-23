package practise.Utils.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"abcd", "efgh","ijk");
        System.out.println(list);


        Collections.shuffle(list);
        System.out.println(list);
    }
}
