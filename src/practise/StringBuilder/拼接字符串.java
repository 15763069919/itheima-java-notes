package practise.StringBuilder;

public class ƴ���ַ��� {
    public static void main(String[] args) {
        //1.��������
        int arr[] = {1, 2, 3};

        //2.���÷����������Ϊ�ַ���
        System.out.println(arrToString(arr));

    }

    public static String arrToString(int arr[]) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                sb.append(arr[i]);
            else
                sb.append(arr[i] + ",");
        }
        sb.append("]");
        return sb.toString();

    }


}
