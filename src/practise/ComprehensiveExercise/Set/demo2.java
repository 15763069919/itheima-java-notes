package practise.ComprehensiveExercise.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class demo2 {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list,"zhangsan","lisi","wnagwu","zhaoliu","zhengqi","chenba","dujiu","sunshi");

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,1);
        Collections.addAll(list,0,0,0);

        Collections.shuffle(list);
        System.out.println(list);
        Integer x = list.get(0);
        System.out.println(x);

        ArrayList<String> girlList = new ArrayList<>();
        ArrayList<String> boyList = new ArrayList<>();

        Collections.addAll(boyList,"zhangsan","lisi","wnagwu","zhaoliu","zhengqi");
        Collections.addAll(girlList,"chenba","dujiu","sunshi");

        Random r = new Random();
        if(x == 1){
            int i = r.nextInt(5);
            System.out.println(boyList.get(i));
        }else{
            int i = r.nextInt(3);
            System.out.println(girlList.get(i));
        }

    }
}
