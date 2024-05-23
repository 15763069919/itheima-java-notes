package algorithm.查找.二分查找;

import algorithm.排序.选择排序.SortUtil;
public class SearchUtil {
    private SearchUtil() {
    }

    public static boolean BinarySearch(int[] arr, int num) {
        //排序，小->大
        SortUtil.SelectionSort(arr);
        //二分查找
        int i=0,j=arr.length-1,half = -1;
        while(i<j){
            half = (i+j)/2;
            if(num == arr[half]) return true;
            else if(num>arr[half])
                i = half+1;//将half排除在范围之外，而不是i=half
            else j = half-1;
        }
        return false;
    }

}
