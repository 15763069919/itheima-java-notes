package practise.regularExpression;

public class 身份证 {
    public static void main(String[] args) {
        //验证用户名
        //要求：大小写字母，数字，下划线一共4-16位
        //请编写正则表达式验证身份证号码是否满足要求。
        String regex1 = "\\w+{4,16}";

        //验证身份证
        //简单要求：18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
        //复杂要求：按照身份证号码的格式严格要求。
        String regex2 = "\\d{17}(\\d|X|x)";
        String regex3 = "\\d{17}[\\dXx]";
        String regex4 = "\\d{17}[\\d(?i)x]";
        String regex5 = "\\d{17}(\\d|(?i)x)";
        System.out.println("370702200502224234".matches(regex2));
        System.out.println("370702200502224234".matches(regex3));
        System.out.println("370702200502224234".matches(regex4));
        System.out.println("370702200502224234".matches(regex5));

        //严格验证
        //3 70702 2005 02 22 4234
        //前面6位：省份，市区，派出所等信息 第一位不能是0，后面5位是任意数字    [1-9]\d{5} √
        // 年的前半段18 19 20                                           (1[89]|20)  √
        // 年的后半段是任意数字出现两次                                    \\d{2} √
        // 月份：01~09 10 11 12                                         (0\d|1[012])   √
        // 日期：01~31                                                  ([01]\\d|3[01]) √
        //后面四位：任意数字出现三次，最后一位是数字或x或X                    \d{3}[\\d(?i)x]  √
//        String regex6 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[012])  (0[1-9]|[12]\\d|\\d3[01])  \\d{3}[\\d(?i)x]";
//        System.out.println("regex6:"+"370702200502224234".matches(regex6));
        String regex7 = "[1-9]\\d{5}(1[89]|20)\\d{2}(0\\d|1[012])([012]\\d|3[01])\\d{3}[\\dx]";
        System.out.println("regex7:" + "370702200502224234".matches(regex7));
    }
}
