package algorithm.����.ѡ������;

public class SortUtil {
    private SortUtil() {
    }

    //ѡ������
    public static void SelectionSort(int[] arr) {
        int minIndex = -1;
        //ѡ�����λ��
        for (int j = 0; j < arr.length-1; j++) {
            //Ĭ����СΪ����λ�õ�ֵ
            minIndex = j;
            //Ѱ����Сֵ������
            for (int i = j+1; i < arr.length; i++) {
                if (arr[i] < arr[minIndex])
                    minIndex = i;
            }
            //����Сֵ�����λ�õ�ֵ����
            int temp = arr[minIndex];
            arr[minIndex] = arr[j];
            arr[j] = temp;
        }
    }
    //ð������
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
