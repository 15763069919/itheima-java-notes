package practise.StringAdvancedPractices;

import java.util.Random;

/*
可以是大小写字母或数字
长度为5，四位字母一位数字，任意位置
 */
public class 生成验证码 {
    public static void main(String[] args) {
        System.out.println(generateCaptchas());
    }

    public static String generateCaptchas() {
        Random r = new Random();
        char[] captchas = new char[5];
        //随机插入数字
        captchas[r.nextInt(5)] = (char) (r.nextInt(10) + '0');
        //随机字母
        for (int i = 0; i < 5; i++) {
            //如果此位置不为0，则continue
            if (captchas[i] != 0)
                continue;
            else {
                int index = r.nextInt(52)+1;    //1~52
                //大于26设置为小写，小于26设置为大写
                captchas[i] = index > 26 ?  (char)(index - 26 + 'a'-1): (char)(index + 'A'-1);
            }
        }
        return new String(captchas);
    }
}
