package practise.ComprehensiveExercise;

public class �㷨ˮ�� {
    public static void main(String[] args) {
        /*
        �Լ�ʵ��parseInt���������ַ���ת��Ϊ����
        Ҫ���ַ���ֻ�������ֲ����������ַ�
        ����һλ�������10λ
        0���ܿ�ͷ
         */

        String str1 = "10086";
        String str2 = "10086a";

        String regex = "[1-9]\\d{0,9}";
        if (!str2.matches(regex)) {
            System.out.println("��������");
        } else {
            System.out.println("����ɹ�");
            int number = 0;
            for (int i = 0; i < str2.length(); i++) {
                char c = str2.charAt(i);
                int num = c - '0';
                number = number * 10 + num;
            }
        System.out.println(number);
        }

    }


}
