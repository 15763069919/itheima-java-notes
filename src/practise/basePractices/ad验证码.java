package practise.basePractices;
import java.util.Random;
public class ad��֤�� {
    public static void main(String[] args) {
        //���ǰ��λ��ĸ
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
        //������һλ����
        int number = r.nextInt(10);
        //��ӡ
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(number);


    }
}
