package algorithm.����.���ֲ���;

import util.getTimeUtil;

import java.util.Arrays;

public class ���ֲ��� {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 5, 4, 2, 3, 6, 5};
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(halfSearch(arr, 6));
        getTimeUtil.getSystemTime();
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }

    public static Boolean halfSearch(int[] arr, int num) {
        int i = 0;  //��ָ��
        int j = arr.length - 1; //��ָ��
        while (i <= j) { //��ָ�������ָ��
            int half = (i + j) / 2; //һ��
            if (num == arr[half]) { //���
                return true;
            } else if (num > arr[half]) {   //
                i = half + 1;
            } else {
                j = half - 1;
            }
        }
        return false;
    }
}
