package practise.StringPractices;

public class �ֻ������� {
    public static void main(String[] args) {
        //1.��ȡһ���ֻ�����
        String phoneNumber = "15763069919";

        //2.��ȡ�ֻ�����ǰ��λ
        String start = phoneNumber.substring(0,3);
//        System.out.println(start);

        //3.��ȡ�ֻ��ź���λ
        String end = phoneNumber.substring(7);

        //4.ƴ��
        String result = start + "****" + end;

        //5.��ӡ
        System.out.println(result);
    }
}
