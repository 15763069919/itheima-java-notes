package practise.Exceptions.�����쳣;

public class �����쳣 {
    public static void main(String[] args) {
        //JVMĬ�ϴ��������쳣��ӡ�ڿ���̨����ֹͣ����
      /*  int[] arr = {1,2,3,4,5,6};
        System.out.println(arr[10]);
        System.out.println("������ִ������");*/


        //�����쳣
        //��ֹͣ����
        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(arr[10]);//�˴����������쳣
                                        //�����ڴ˴�������һ���쳣ArrayIndexOutOfBoundsException�Ķ���
                                        //new ArrayIndexOutOfBoundsException()
                                        //�����������ȥ��catchС�����еı������Աȣ������Ƿ�����ܽ����������
                                        //��������գ�������쳣������ִ��catch����Ĵ���
                                        //��catch����Ĵ��뱻ִ���꣬����ִ��try����catch��ϵ����Ĵ���
        }catch(ArrayIndexOutOfBoundsException e){
            //���������
            System.out.println("����Խ����");
        }
        System.out.println("������ִ������");
    }
}
