package practise.StringAdvancedPractices;

import java.util.Random;

/*
�����Ǵ�Сд��ĸ������
����Ϊ5����λ��ĸһλ���֣�����λ��
 */
public class ������֤�� {
    public static void main(String[] args) {
        System.out.println(generateCaptchas());
    }

    public static String generateCaptchas() {
        Random r = new Random();
        char[] captchas = new char[5];
        //�����������
        captchas[r.nextInt(5)] = (char) (r.nextInt(10) + '0');
        //�����ĸ
        for (int i = 0; i < 5; i++) {
            //�����λ�ò�Ϊ0����continue
            if (captchas[i] != 0)
                continue;
            else {
                int index = r.nextInt(52)+1;    //1~52
                //����26����ΪСд��С��26����Ϊ��д
                captchas[i] = index > 26 ?  (char)(index - 26 + 'a'-1): (char)(index + 'A'-1);
            }
        }
        return new String(captchas);
    }
}
