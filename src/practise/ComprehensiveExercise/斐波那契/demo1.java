package practise.ComprehensiveExercise.ì³²¨ÄÇÆõ;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {

        //extracted();

        System.out.println(f(12));
    }
    private static int f(int month){
        if(month == 1 || month == 2){
            return 1;
        }
        return f(month-1)+f(month-2);
    }

    private static void extracted() {
        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println(Arrays.toString(arr));
    }
}
