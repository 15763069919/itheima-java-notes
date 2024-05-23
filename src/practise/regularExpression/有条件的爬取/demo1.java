package practise.regularExpression.����������ȡ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo1 {
    /*
    �������ı����밴��Ҫ����ȡ���ݡ�
Java�Դ�95�����������������˺ܶ�汾��Ŀǰ��ҵ���õ�������Java8��Java11,��Ϊ�������ǳ�
��֧�ְ汾����һ������֧�ְ汾��Java17.������δ������Java17Ҳ���𽥵�����ʷ��̨
����1:��ȡ�汾��Ϊ8,11,17��Java�ı�������ֻҪJava����ʾ�汾�š�
����2:��ȡ�汾��Ϊ8,11,17��Java�ı�����ȷ��ȡ���Ϊ��Java8 Java11 Java17 Java17
����3:��ȡ���˰汾��Ϊ8,11,17��Java�ı���
     */

    public static void main(String[] args) {
        String str = "Java�Դ�95�����������������˺ܶ�汾��Ŀǰ��ҵ���õ�������Java8��Java11,��Ϊ�������ǳ�\n" +
                "��֧�ְ汾����һ������֧�ְ汾��Java17.������δ������Java17Ҳ���𽥵�����ʷ��̨";

        //����1:��ȡ�汾��Ϊ8,11,17��Java�ı�������ֻҪJava����ʾ�汾�š�
        //?�������Ϊǰ�������Java
        //=��ʾ��Java����Ҫ��������ݣ������ڻ�ȡ��ʱ��ֻ��ȡǰ�벿��
        String redex1 = "((?i)java)(?=8|11|17)";
        Pattern p1 = Pattern.compile(redex1);
        Matcher m1 = p1.matcher(str);
        while(m1.find()){
            String s1 = m1.group();
            System.out.println(s1);
        }

        System.out.println("=============================");

//        ����2:��ȡ�汾��Ϊ8,11,17��Java�ı�����ȷ��ȡ���Ϊ��Java8 Java11 Java17 Java17
        String redex2 = "((?i)java)(8|11|17)";
        Pattern p2 = Pattern.compile(redex2);
        Matcher m2 = p2.matcher(str);
        while(m2.find()){
            String s2 = m2.group();
            System.out.println(s2);
        }

        System.out.println("=============================");

        String redex3 = "((?i)java)(?:8|11|17)";
        Pattern p3 = Pattern.compile(redex3);
        Matcher m3 = p3.matcher(str);
        while(m3.find()){
            String s3= m3.group();
            System.out.println(s3);
        }

        System.out.println("=============================");

//        ����3:��ȡ���˰汾��Ϊ8,11,17��Java�ı���

        String redex4 = "((?i)java)(?!8|11|17)";
        Pattern p4 = Pattern.compile(redex4);
        Matcher m4 = p4.matcher(str);
        while(m4.find()){
            String s4= m4.group();
            System.out.println(s4);
        }

    }
}
