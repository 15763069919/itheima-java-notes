package algorithm.����.��������;

import java.util.Arrays;

public class �������� {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        System.out.println(Arrays.toString(arr));


        //1.Ѱ������ʼ������
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {//��ͷ����Ѱ��
            if (arr[i] > arr[i + 1]) {  //�������С->��
//                System.out.println(i);
                startIndex = i + 1; //��¼��һλ��������ʼ����
                break;
            }
        }
        //2.���εõ������ÿһ��Ԫ��
        //{3, 44,       38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48}
        for (int i = startIndex; i < arr.length; i++) { //��������
            for (int j = i-1; j >=0; j--) {    //�����������
                if(arr[i]<arr[j]){  //ȡ���������������С���򽻻�λ��
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i -= 1; //�ƶ�ָ�����ָ��ԭ��
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
