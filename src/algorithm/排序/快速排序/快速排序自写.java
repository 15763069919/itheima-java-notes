package algorithm.排序.快速排序;

import java.util.Arrays;

public class 快速排序自写 {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    //                                     数组，开始索引，结束索引
    private static void quickSort(int[] arr, int i, int j) {
        //记录指针位置
        int start = i;
        int end = j;

        if (start > end)
            return;

        //记录基准数
        int baseNumber = arr[i];

        //寻找交换的数
        while (start != end) {


            //左指针找到大于基准数的值
            while (true) {
                if (start >= end || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }

            //右指针找到小于基准数的值
            while (true) {
                if (start >= end || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }

            //交换指针指向的数
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //交换基准数
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        //继续在基准数左右循环次操作
        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);

    }
}
