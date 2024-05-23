package practise.BigIntegerAndBigDecimal;

import java.math.BigInteger;
import java.util.Random;

public class ��ȡBigInteger�Ķ��� {
    public static void main(String[] args) {
        Random r = new Random();
        //��ȡһ������Ĵ�����
        BigInteger bi = new BigInteger(4, r);

        System.out.println("��ȡһ������Ĵ�������" + bi);

        //��ȡһ��ָ���Ĵ�����
        BigInteger b2 = new BigInteger("1234567890000000000000000");

        System.out.println("��ȡһ��ָ���Ĵ�������" + b2);

        //��ȡָ�����ƵĴ�����
        BigInteger b3 = new BigInteger("11111111111111111111111111111111111111", 2);

        System.out.println("��ȡָ�����ƵĴ�������" + b3);


        //�鿴long��ȡֵ��Χ���
        System.out.println("long�����ֵ��" + Long.MAX_VALUE);

        //valueOf
        BigInteger bi1 = BigInteger.valueOf(9223372036854775807L);
        System.out.println(bi1);

        //��֤-16~16���Ż�
        BigInteger bi2 = BigInteger.valueOf(16);
        BigInteger bi3 = BigInteger.valueOf(16);
        System.out.println(bi2 == bi3);//true

        BigInteger bi4 = BigInteger.valueOf(17);
        BigInteger bi5 = BigInteger.valueOf(17);
        System.out.println(bi4 == bi5);//false

        //����һ����������������ݲ��ܷ����ı�
        BigInteger bi6 = BigInteger.valueOf(1);
        BigInteger bi7 = BigInteger.valueOf(2);
        BigInteger result = bi6.add(bi7);
        System.out.println(result == bi6);//false
        System.out.println(result == bi7);//false
        //��ʱ�������޸Ĳ�������BIgInteger��ֵ�����ǻ����´���һ������

    }
}
