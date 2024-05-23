package practise.StringPractices;

public class 身份证信息查看 {
    public static void main(String[] args) {
        //1.定义一个字符串记录身份证号码
        String id = "370702200503116218";

        //2.获取出生年月日
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);

        System.out.println("人物信息为：" + year + "年" + month + "月" + day + "日");

        //3.获取性别
        char sex = id.charAt(16);
        //字符'0' -> 数字0
        int sexId = sex - '0';
        //奇男偶女
        if (sexId % 2 == 0) {
            System.out.println("性别为：女");
        } else {
            System.out.println("性别为：男");
        }
    }
}
