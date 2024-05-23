package practise.ListAndMap.Map.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeMap;

public class demo3 {
    public static void main(String[] args) {
        String str = "aababcabcdabcde";
        TreeMap<Character, Integer> tm = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (tm.containsKey(c)) {
                Integer count = tm.get(c);
                count++;
                tm.put(c, count);
            } else {
                tm.put(c, 1);
            }
        }


        //拼接方式1

        Set<Map.Entry<Character, Integer>> entries = tm.entrySet();
        for (Map.Entry entry : entries) {
            System.out.print(entry.getKey() + "(" + entry.getValue() + ")");
        }
        System.out.println();


        //拼接方式2

        StringBuilder sb = new StringBuilder();
        tm.forEach((Character character, Integer integer) -> sb.append(character).append("(").append(integer).append(")"));
        System.out.println(sb);


        //拼接方式2
        StringJoiner sj = new StringJoiner("", "", "");
        tm.forEach((Character character, Integer integer) -> sj.add(character + "").add("(").add(integer + "").add(")"));
        System.out.println(sj);
    }
}