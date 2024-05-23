package algorithm.����.��������;

import java.util.Arrays;

public class ����������д {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    //                                     ���飬��ʼ��������������
    private static void quickSort(int[] arr, int i, int j) {
        //��¼ָ��λ��
        int start = i;
        int end = j;

        if (start > end)
            return;

        //��¼��׼��
        int baseNumber = arr[i];

        //Ѱ�ҽ�������
        while (start != end) {


            //��ָ���ҵ����ڻ�׼����ֵ
            while (true) {
                if (start >= end || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }

            //��ָ���ҵ�С�ڻ�׼����ֵ
            while (true) {
                if (start >= end || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }

            //����ָ��ָ�����
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //������׼��
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        //�����ڻ�׼������ѭ���β���
        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);

    }
}
