package practise.lambda;

import java.util.Arrays;

public class dm1 {
    public static void main(String[] args) {
        Integer[] arr = {1, 4, 3, 5, 5, 4, 2, 3, 6, 5};
        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });*/

       /* Arrays.sort(arr, (Integer o1, Integer o2) -> {
                    return o1 - o2;
                }
        );*/

        Arrays.sort(arr, (o1, o2) -> o1 - o2);
        System.out.println(Arrays.toString(arr));

    }
}
