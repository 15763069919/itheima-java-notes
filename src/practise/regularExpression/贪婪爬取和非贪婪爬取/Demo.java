package practise.regularExpression.̰����ȡ�ͷ�̰����ȡ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    /*
    �������ı����밴��Ҫ����ȡ���ݡ�
Java�Դ�95������������abbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaa
�����˺ܶ�汾��Ŀǰ��ҵ���õ�������Java8��Java11,��Ϊ�������ǳ���֧�ְ汾����һ������
֧�ְ汾��Java17,������δ������Java17Ҳ���𽥵�����ʷ��̨
����1:����ab+�ķ�ʽ��ȡab,b�����ܶ��ȡ
����2:����ab+�ķ�ʽ��ȡab,b�������ٻ�ȡ
     */
    public static void main(String[] args) {
        String str = "Java�Դ�95������������abbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaa\n" +
                "�����˺ܶ�汾��Ŀǰ��ҵ���õ�������Java8��Java11,��Ϊ�������ǳ���֧�ְ汾����һ������\n" +
                "֧�ְ汾��Java17,������δ������Java17Ҳ���𽥵�����ʷ��̨";
        //        ����1:����ab+�ķ�ʽ��ȡab,b�����ܶ��ȡ
        String redex1 = "ab+";
        Pattern p1 = Pattern.compile(redex1);
        Matcher m1 = p1.matcher(str);
        while(m1.find()){
            String s1 = m1.group();
            System.out.println(s1);
        }

        String redex2 = "ab+?";
        Pattern p2 = Pattern.compile(redex2);
        Matcher m2 = p2.matcher(str);
        while(m2.find()){
            String s2 = m2.group();
            System.out.println(s2);
        }





//        ����2:����ab+�ķ�ʽ��ȡab,b�������ٻ�ȡ

    }
}
