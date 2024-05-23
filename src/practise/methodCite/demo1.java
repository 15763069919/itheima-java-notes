package practise.methodCite;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        Integer[] arr = {3,5,4,1,6,2};

        //匿名内部类
        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));*/

        //lambda
        //lambda的简化
        Arrays.sort(arr,(o1,o2)->o2-o1);
        System.out.println(Arrays.toString(arr));

        //方法引用
        //表示引用demo1类里面的subtraction方法，把这个方法当作抽象方法的方法体
        Arrays.sort(arr,demo1::subtraction);    //类名::方法名
    }
    public static int subtraction(int num1,int num2){
        return num2-num1;
    }
}
