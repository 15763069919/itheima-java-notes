package algorithm.����.���ֲ���;

import algorithm.����.ѡ������.SortUtil;
public class SearchUtil {
    private SearchUtil() {
    }

    public static boolean BinarySearch(int[] arr, int num) {
        //����С->��
        SortUtil.SelectionSort(arr);
        //���ֲ���
        int i=0,j=arr.length-1,half = -1;
        while(i<j){
            half = (i+j)/2;
            if(num == arr[half]) return true;
            else if(num>arr[half])
                i = half+1;//��half�ų��ڷ�Χ֮�⣬������i=half
            else j = half-1;
        }
        return false;
    }

}
