package practise.basePractices;

public class aa¸´ÖÆÊý×é {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int array[] = copyOfRange(arr, 3, 7);
        printArr(array);
    }
  
    public static int[] copyOfRange(int arr[], int from, int to) {
        int array[] = new int[to - from];
        for (int i = from, j = 0; i < to; i++, j++)
            array[j] = arr[i];
        return array;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i]);
            else System.out.print(arr[i] + ",");
        }
    }
}
