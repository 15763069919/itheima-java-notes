package practise.regularExpression.����;

public class �����ⲿ������� {
    public static void main(String[] args) {
        /*
        ��ϰ �ڳ��滻
        ����
        ���ַ�������Ҫѧѧ����̳̳̳̳̳̳�
        �滻Ϊ����Ҫѧ���
         */
        String str = "��Ҫѧѧ����̳̳̳̳̳̳�";
        //(.)���ظ����ݵĵ�һ���ַ�
        //\\1+���ظ����ݶ�γ���
        //$1����������ʽ��һ��������ó�����һ���ã���Ϊ�����ⲿ�ģ����Բ���\\����$
        String s = str.replaceAll("(.)\\1+", "$1");
        System.out.println(s);

    }
}
