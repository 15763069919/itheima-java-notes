package practise.Exceptions.�׳�����;

public class demo1 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(getMax(arr));

        //������
        int[] nullArr = null;
        int max = 0;
        //ʹ��try catch�����쳣����ֹ����ֹͣ
        try {
            max = getMax((nullArr));
        } catch (NullPointerException e) {
            System.out.println("��ָ���쳣");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("����Խ���쳣");

        }
        System.out.println(max);

        //����Ϊ0������
//        int[] emptyArr = {};
//        System.out.println(emptyArr);
    }

    public static int getMax(int[] arr) /*throws NullPointerException,ArrayIndexOutOfBoundsException*/{
        if(arr == null){
            //�ֶ�����һ���쳣���󣬲�������쳣���������ĵ�����
            //������ֹͣ����
            throw new NullPointerException();
        }
        if(arr.length==0){
            //�ֶ�����һ���쳣���󣬲�������쳣���������ĵ�����
            //������ֹͣ����
            throw new ArrayIndexOutOfBoundsException();
        }

        System.out.println("������ִ������");
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
