package practise.Exceptions.�����쳣;

public class ������� {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        try {
            System.out.println(arr[10]);
            System.out.println(2/0);
            System.out.println("������ִ������1");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("����Խ����");
        }
        System.out.println("������ִ������2");
    }
}
