package algorithm;

public class AA�������ж��㷨 {
    public static void main(String[] args) {
        //˼·:   1.���������� 2.�Ƚ��Ƿ�һ��
        int x = 12345;
        int num = 0;
        while(x!=0)
        {
            int ge = x % 10;    //ȡ��,��ȡÿ�����ĸ�λ��
            x = x / 10; //java����������������������,��ȥ����λ��
            num = num * 10 + ge;    //��ÿ����λ����Ϊʮλ,��λ,ǧλ,��λ
        }
        System.out.println(num);
    }
}
