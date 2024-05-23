package practise.regularExpression.����;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String str = "Java�Դ�95�����������������˺ܶ�汾��Ŀǰ��ҵ���õ�������Java8��Java11," +
                "��Ϊ�������ǳ���֧�ְ汾����һ������֧�ְ汾��Java7,������δ������Java7Ҳ�����µ�����ʷ��̨";

        String regex = "(?i)java\\d{0,2}";
        //1.����������ʽ������������ʽ����
        Pattern p = Pattern.compile(regex);
        //2.���ݴ󴮣������ı�ƥ�����Ķ���
        Matcher m = p.matcher(str);

       /* //3.ʹ���ı�ƥ����������ȡ�����ײ��¼��ʼ�����ͽ�������+1��
        Boolean b = m.find();
        //4.������ȡ�ģ��������ݼ�¼���������еײ��ַ����Ľ�ȡ�������ؽ�ȡ���ַ������ַ���
        String s = m.group();
        //5.��ӡ
        System.out.println(s);*/

        while(m.find()){
            String s = m.group();
            System.out.println(s);
        }
    }
}
