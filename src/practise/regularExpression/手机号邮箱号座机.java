package practise.regularExpression;

public class 手机号邮箱号座机 {
    public static void main(String[] args) {

        // 验证电话号码
        //分成三部分：
        //第一部分：1 表示只能由1开头
        // 第二部分：3-9 表示第二位只能由3-9的数字组成
        // 第三部分：任意数字可以出现9位
        String telephoneNumber = "13812345678";
        String regex1 = "1[3-9]\\d{9}";
        System.out.println(telephoneNumber.matches(regex1));

        // 验证邮箱
        // 分成三部分：
        //第一部分：任意的数字和下划线，至少出现一次就可以了
        // 第二部分：@
        // 第三部分：可以是字母可以是数字,任意的字母加数字总共出现2-6位，且不能出现下划线
        // 第四部分：.   需要转义
        //因为正则表达式中.表示任意字符，所以\.才是. ，又因为在java中\.是转义字符，所以还要加个\
        // 第五部分：大写字母和小写字母都可以，只能出现2-3次
        //第六部分：把第四部分和第五部分看成一组，这一组能出现1-2次
        String email = "1435542365@qq.com";
        String regex2 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-z]{2,3}){1,2}";
        System.out.println(email.matches(regex2));


        // 验证手机号码
        // 分成三部分：
        //第一部分：区号 第一位0，从第二位开始可以是任意的数字，可以出现2到3次
        // 第二部分：-   次数0或1
        // 第三部分：号码  第一位不能以0开头，从第二位可以是任意数字，-后面的号码总长度为5-10位
        String phoneNumber = "020-2324242";
        String regex3 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println(phoneNumber.matches(regex3));


        //插件any-rule
        //23:11:11
        String regex4 = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        String regex5 = "([01]\\d|2[0-3])(:[0-5]\\d){2}";
    }
}
