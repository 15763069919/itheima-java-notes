package practise.Exceptions.Throwable��Ա����;

public class demo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage()); //���쳣�ļ��������ӡ�ڿ���̨
            System.out.println(e.toString());   //���쳣תΪ�ַ�����ӡ�ڿ���̨
            e.printStackTrace();    //�������Ժ�ɫ�����彫�쳣��ӡ�ڿ���̨������ֹͣ����
        }

        System.out.println("������ִ������");

        //����������
        System.out.println(123);
        //������ӡ������Ϣ��������
        System.err.println(123);
    }
}
