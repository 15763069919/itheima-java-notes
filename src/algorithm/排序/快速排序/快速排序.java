package algorithm.排序.快速排序;

import java.util.Arrays;

public class 快速排序 {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;

        if(start > end){
            return; //递归的出口
        }

        //记录基准数
        int baseNumber = arr[i];

        //利用循环找到要交换的数字
        while (start != end) {
            //利用end，从后往前，找比基准数小的数字
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            //利用start，从前往后，找比基准数大的数字
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }
            //end 与 start 指向的元素进行交换
            int tmp = arr[start];
            arr[start] =arr[end];
            arr[end] = tmp;
        }
        //start == end 循环结束 -- 已经找到了基准数的位置，基准数归位
        int tmp = arr[i];
        arr[i] = arr[start];
        arr[start] = tmp;


        //确定6左边的范围，重复
        quickSort(arr,i ,start-1);
        //确定6右边的范围，重复
        quickSort(arr,start+1,j);


    }

}
