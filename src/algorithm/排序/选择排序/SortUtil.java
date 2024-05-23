package algorithm.排序.选择排序;

public class SortUtil {
    private SortUtil() {
    }

    //选择排序
    public static void SelectionSort(int[] arr) {
        int minIndex = -1;
        //选择放入位置
        for (int j = 0; j < arr.length-1; j++) {
            //默认最小为放入位置的值
            minIndex = j;
            //寻找最小值的索引
            for (int i = j+1; i < arr.length; i++) {
                if (arr[i] < arr[minIndex])
                    minIndex = i;
            }
            //将最小值与放入位置的值交换
            int temp = arr[minIndex];
            arr[minIndex] = arr[j];
            arr[j] = temp;
        }
    }
    //冒泡排序
    public static void BubbleSortUtil(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }


}
