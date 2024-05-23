package practise.regularExpression;

public class qq号校验例题 {
    /*
    6到20位之间,0不能开头，必须全部是数字
    */
    public static void main(String[] args) {
        String qq = "1234567890";
        System.out.println(checkQQ(qq));

        System.out.println(qq.matches("[1-9]\\d{5,19}"));

    }

    public static boolean checkQQ(String qq) {
        int len = qq.length();
        char zeroIndex = qq.charAt(0);
        /*或使用
        if(qq.startsWith("0"))
            return false;*/

        //6到20位之间,0不能开头
        if (zeroIndex == 0 || len > 20 || len < 6) return false;

        //必须全部是数字
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9') return false;
        }
        return true;
    }
}
