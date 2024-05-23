package practise.basePractices;
import java.util.Random;
public class ad验证码 {
    public static void main(String[] args) {
        //随机前四位字母
        Random r = new Random();
        char arr[] = new char[4];
        for(int i = 0;i<4;i++)
        {
            char letter = 'A';
            int num = r.nextInt(52);

            while (26<=num&31>=num)
            {
                num = r.nextInt(52);
            }
            letter += num;
            arr[i]=letter;
        }
        //随机最后一位数字
        int number = r.nextInt(10);
        //打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(number);


    }
}
