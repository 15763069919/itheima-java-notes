package practise.regularExpression.����;

public class �����ڲ�����������ϰ {
    public static void main(String[] args) {
//����1:�ж�һ���ַ����Ŀ�ʼ�ַ��ͽ����ַ��Ƿ�һ�£�ֻ����һ���ַ�
//������a123a b456b 17891 &abc&
        String redex1 = "(.).+\\1";
        System.out.println("a123a".matches(redex1));
        System.out.println("b456b".matches(redex1));
        System.out.println("17891".matches(redex1));
        System.out.println("&abc&".matches(redex1));
        System.out.println("&abc".matches(redex1));

        System.out.println("====================================");

//����2:�ж�һ���ַ����Ŀ�ʼ���ֺͽ��������Ƿ�һ�£������ж���ַ�
//������abc123abc b456b 123789123 &!@abc&!@   abc123abd(false)
        String redex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(redex2));
        System.out.println("b456b".matches(redex2));
        System.out.println("123789123".matches(redex2));
        System.out.println("&!@abc&!@".matches(redex2));
        System.out.println("abc123abd".matches(redex2));

        System.out.println("====================================");

//����3���ж�һ���ַ����Ŀ�ʼ���ֺͽ��������Ƿ�һ�£���ʼ�����ڲ�ÿ���ַ�Ҳ��Ҫһ��
//������ aal23aaa bbb456bbbb 111789111 &&abc&&
        //* ����0���Σ�����\\1���ֵĴ�������\\1ָ���ǵ�һ���ַ��������һ���ַ�һ��
        //(.)������һ����ĸ��Ϊһ�鲢�̶�
        //\\1�����һ��һ��
        //*����\\1���ֵĴ���Ϊ0��������
        //\\2��ָ����((.)\1*)
        String redex3 = "((.)\\1*).+\\2";
        System.out.println("aal23aaa".matches(redex3));//true
        System.out.println("bbb456bbbb".matches(redex3));//true
        System.out.println("111789111".matches(redex3));//true
        System.out.println("&&abc&&".matches(redex3));//true
        System.out.println("&&abc".matches(redex3));//false

    }
}
