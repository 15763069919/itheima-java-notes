package practise.regularExpression.����;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1������ȡ {
    /*
    �������ı����밴��Ҫ����ȡ���ݡ�
Java �Դ�95�����������������˺ܶ�汾��Ŀǰ��ҵ���õ�������java8��java11,��Ϊ��
�����ǳ���֧�ְ汾����һ������֧�ְ汾��laval7,������δ������laval7Ҳ�����µ�����ʷ��̨
Ҫ���ҳ��������е�javaxx
     */
    public static void main(String[] args) {
        String str = "Java�Դ�95�����������������˺ܶ�汾��Ŀǰ��ҵ���õ�������Java8��Java11," +
                "��Ϊ�������ǳ���֧�ְ汾����һ������֧�ְ汾��Java7,������δ������Java7Ҳ�����µ�����ʷ��̨";

        //pattern����ʾ������ʽ
        //Matcher���ı�ƥ�����������ǰ���������ʽ�Ĺ���ȥ��ȡ�ַ�������ͷ��ʼ��ȡ
        //�ڴ���ȥѰ�ҷ���ƥ�������Ӵ�

//        method1(str);



        //1.��ȡ������ʽ�Ķ���
        Pattern p = Pattern.compile("(?i)java\\d{0,2}");
        //2.��ȡ�ı�ƥ�����Ķ���
        //����mȥ��str�з���p������Ӵ�
        Matcher m = p.matcher(str);
        //3������ѭ��
        while(m.find()){
            String s = m.group();
            System.out.println(s);
        }

    }

    private static void method1(String str) {
        //��ȡ������ʽ�Ķ���
        Pattern p = Pattern.compile("(?i)java\\d{0,2}");
        //��ȡ�ı�ƥ�����Ķ���
        //m���ı�ƥ�����Ķ���
        //p������������ʽ�Ķ���
        //str����
        //mҪ��str��ȥ�ҷ���p�����С��
        Matcher m = p.matcher(str);

        //�����ı�ƥ������ͷ��ʼ��ȡ��Ѱ���Ƿ������������Ӵ�
        //���û�У�����false
        //����У�����true���ڵײ��¼�Ӵ�����ʼ�����ͽ�������+1
        //eg:��¼��ͷ��java������¼0,4
        boolean b = m.find();

        //�����ײ�����find������¼���ַ����������н�ȡ
        //subString(��ʼ��������������); ��ͷ����β
        //(0,4)���ǲ�����4����
        //��ѽ�ȡ���С�����з���
        String s1 = m.group();
        System.out.println(s1);

        //�ڶ��ε���find������ʱ�򣬻������ȡ���������
        //��ȡ���ڶ���������Ӵ����������������true
        //���ѵڶ����Ӵ�����ʼ�����ͽ�������+1�����м�¼
        b = m.find();

        //�ڶ��ε���group������ʱ�򣬻����find������¼���������н�ȡ
        String s2 = m.group();
        System.out.println(s2);
    }
}
