package practise.methodCite;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        Integer[] arr = {3,5,4,1,6,2};

        //�����ڲ���
        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));*/

        //lambda
        //lambda�ļ�
        Arrays.sort(arr,(o1,o2)->o2-o1);
        System.out.println(Arrays.toString(arr));

        //��������
        //��ʾ����demo1�������subtraction����������������������󷽷��ķ�����
        Arrays.sort(arr,demo1::subtraction);    //����::������
    }
    public static int subtraction(int num1,int num2){
        return num2-num1;
    }
}
