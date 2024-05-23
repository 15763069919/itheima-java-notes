package practise.lambda;

import java.util.Arrays;

public class dm2 {
    public static void main(String[] args) {
        String[] arr = {"a","aaaa","aaa","aa"};
        Arrays.sort(arr, ( o1,  o2) ->o2.length()-o1.length());
        System.out.println(Arrays.toString(arr));
    }
}
