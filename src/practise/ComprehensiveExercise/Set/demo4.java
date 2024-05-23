package practise.ComprehensiveExercise.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class demo4 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> city1 = new ArrayList<>();
        ArrayList<String> city2 = new ArrayList<>();
        ArrayList<String> city3 = new ArrayList<>();

        Collections.addAll(city1, "南京", "扬州", "苏州", "无锡", "常州");
        Collections.addAll(city2, "武汉", "孝感", "十堰", "宜昌", "鄂州");
        Collections.addAll(city3, "石家庄", "唐山", "邢台", "保定", "张家口");

        hm.put("江苏省", city1);
        hm.put("湖北省", city2);
        hm.put("河北省", city3);

        hm.forEach((String s, ArrayList<String> strings) -> {
            System.out.print(s + " = ");
            for (int i = 0; i < strings.size(); i++) {
                if (i == strings.size() - 1) {
                    System.out.print(strings.get(i));
                } else {
                    System.out.print(strings.get(i) + "，");
                }
            }
            System.out.println();
        });


    }
}
