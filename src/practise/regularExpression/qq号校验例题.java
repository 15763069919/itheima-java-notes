package practise.regularExpression;

public class qq��У������ {
    /*
    6��20λ֮��,0���ܿ�ͷ������ȫ��������
    */
    public static void main(String[] args) {
        String qq = "1234567890";
        System.out.println(checkQQ(qq));

        System.out.println(qq.matches("[1-9]\\d{5,19}"));

    }

    public static boolean checkQQ(String qq) {
        int len = qq.length();
        char zeroIndex = qq.charAt(0);
        /*��ʹ��
        if(qq.startsWith("0"))
            return false;*/

        //6��20λ֮��,0���ܿ�ͷ
        if (zeroIndex == 0 || len > 20 || len < 6) return false;

        //����ȫ��������
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9') return false;
        }
        return true;
    }
}
