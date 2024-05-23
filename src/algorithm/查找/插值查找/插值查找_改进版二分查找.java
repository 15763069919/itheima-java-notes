package algorithm.����.��ֵ����;

import util.getTimeUtil;

import java.util.Arrays;

public class ��ֵ����_�Ľ�����ֲ��� {

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
        int min = 0;  //��ָ��
        int max = arr.length - 1; //��ָ��
        while (min <= max) { //��ָ�������ָ��
//            int half = (min + max) / 2; //һ��
            int half = (num-min)/(arr[max]-arr[min])*(max-min);
            if (num == arr[half]) { //���
                return true;
            } else if (num > arr[half]) {   //
                min = half + 1;
            } else {
                max = half - 1;
            }
        }
        return false;
    }
}

