package algorithm.排序.插入排序;

import java.util.Arrays;

public class 插入排序 {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        System.out.println(Arrays.toString(arr));


        //1.寻找无序开始的索引
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {//从头遍历寻找
            if (arr[i] > arr[i + 1]) {  //如果不是小->大
//                System.out.println(i);
                startIndex = i + 1; //记录下一位，即无序开始索引
                break;
            }
        }
        //2.依次得到无序的每一个元素
        //{3, 44,       38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48}
        for (int i = startIndex; i < arr.length; i++) { //遍历无序
            for (int j = i-1; j >=0; j--) {    //倒叙遍历有序
                if(arr[i]<arr[j]){  //取出的数若比有序的小，则交换位置
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i -= 1; //移动指针持续指向原数
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
