package practise.regularExpression.����;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
    /*
    ���󣺰������ı��еĵ绰�����䣬�ֻ��ţ����߶���ȡ������
    ���������Աѧϰjava,
    �绰��18512516758,18512508907
    ������ϵ���䣺boniu@itcast.cn
    �����绰��01036517895,010-98951256
    ���䣺bozai@itcast.cn
    ���ߵ绰��400-618-9090,400-618-4000,4006184000,40061890909090
     */
    public static void main(String[] args) {
        String str = "���󣺰������ı��еĵ绰�����䣬�ֻ��ţ����߶���ȡ������\n" +
                "���������Աѧϰjava,\n" +
                "�绰��18512516758,18512508907\n" +
                "������ϵ���䣺boniu@itcast.cn\n" +
                "�����绰��01036517895,010-98951256\n" +
                "���䣺bozai@itcast.cn\n" +
                "���ߵ绰��400-618-9090,400-618-4000,4006184000,4006189090";

        String redex = "((?:(?:\\+|00)86)?1[3-9]\\d{9})"
                + "|(\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-z]{2,3}){1,2})"
                +"|(0\\d{2,3}-?[1-9]\\d{4,9})"
                +"|(400-?\\d{3}-?\\d{4})";
        //����������ʽ����
        //�����ı�ƥ����
        Pattern p = Pattern.compile(redex);
        Matcher m = p.matcher(str);
        while(m.find()){
            String s = m.group();
            System.out.println(s);
        }


    }
}
