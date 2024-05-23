package algorithm.≈≈–Ú.—°‘Ò≈≈–Ú;

public class Test {
    public static void main(String[] args) {
        //∂®“Â
        int[] arr = {1, 4, 3, 5, 5, 4, 2, 3, 6, 5};
        //≈≈–Ú
//        sortUtil.SelectionSort(arr);
        SortUtil.BubbleSortUtil(arr);
        //¥Ú”°
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.println(arr[i]);
            else
                System.out.print(arr[i] + ",");
        }
    }
}
