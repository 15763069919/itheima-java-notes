package learn.String;

public class CreateString {
    public static void main(String[] args) {
        //1.ʹ��ֱ�Ӹ�ֵ�ķ�ʽ��ȡһ���ַ�������
        String s1 = "abc";
        System.out.println(s1);

        //2.ʹ��new�ķ�ʽ����ȡһ���ַ�������
        //�ղι���
        String s2 = new String();
        System.out.println("@"+s2+"!");

        //3.����һ���ַ��������ݴ��ݵ��ַ��������ٴ���һ���µ��ַ���
        String s3 = new String("abc");
        System.out.println(s3);

        //4.����һ���ַ����飬�����ַ�����������ٴ���һ���µ��ַ�������
        //�����޸��ַ��������ݡ�abc->qbc
        //abc -> {'a','b','c'} -> {'q','b','c'} -> "qbc"
        //�ַ��������Է����仯�����ַ�������Է����仯
        char chs[] = {'a', 'b', 'c', 'd'};
        String s4 = new String(chs);
        System.out.println(s4);

        //5.����һ���ֽ����飬�����ֽ�����������ٴ���һ���µ��ַ�������
        //Ӧ�ó������Ժ������統�д����������ʵ�����ֽ���Ϣ
        //����Ҫ���ֽ���Ϣ����ת�����ַ�������ʱ���õ��������
        byte bytes[] = {97,98,99,100};//ASCII����ת��
        String s5 = new String(bytes);
        System.out.println(s5);//abc

    }
}
