package algorithm.����.��������;

import java.util.Arrays;

public class �������� {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;

        if(start > end){
            return; //�ݹ�ĳ���
        }

        //��¼��׼��
        int baseNumber = arr[i];

        //����ѭ���ҵ�Ҫ����������
        while (start != end) {
            //����end���Ӻ���ǰ���ұȻ�׼��С������
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            //����start����ǰ�����ұȻ�׼���������
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }
            //end �� start ָ���Ԫ�ؽ��н���
            int tmp = arr[start];
            arr[start] =arr[end];
            arr[end] = tmp;
        }
        //start == end ѭ������ -- �Ѿ��ҵ��˻�׼����λ�ã���׼����λ
        int tmp = arr[i];
        arr[i] = arr[start];
        arr[start] = tmp;


        //ȷ��6��ߵķ�Χ���ظ�
        quickSort(arr,i ,start-1);
        //ȷ��6�ұߵķ�Χ���ظ�
        quickSort(arr,start+1,j);


    }

}
