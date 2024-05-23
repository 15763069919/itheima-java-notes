package practise.BigIntegerAndBigDecimal;

import java.math.BigInteger;
import java.util.Random;

public class 获取BigInteger的对象 {
    public static void main(String[] args) {
        Random r = new Random();
        //获取一个随机的大整数
        BigInteger bi = new BigInteger(4, r);

        System.out.println("获取一个随机的大整数：" + bi);

        //获取一个指定的大整数
        BigInteger b2 = new BigInteger("1234567890000000000000000");

        System.out.println("获取一个指定的大整数：" + b2);

        //获取指定进制的大整数
        BigInteger b3 = new BigInteger("11111111111111111111111111111111111111", 2);

        System.out.println("获取指定进制的大整数：" + b3);


        //查看long的取值范围最大
        System.out.println("long的最大值：" + Long.MAX_VALUE);

        //valueOf
        BigInteger bi1 = BigInteger.valueOf(9223372036854775807L);
        System.out.println(bi1);

        //验证-16~16的优化
        BigInteger bi2 = BigInteger.valueOf(16);
        BigInteger bi3 = BigInteger.valueOf(16);
        System.out.println(bi2 == bi3);//true

        BigInteger bi4 = BigInteger.valueOf(17);
        BigInteger bi5 = BigInteger.valueOf(17);
        System.out.println(bi4 == bi5);//false

        //对象一旦创建，里面的数据不能发生改变
        BigInteger bi6 = BigInteger.valueOf(1);
        BigInteger bi7 = BigInteger.valueOf(2);
        BigInteger result = bi6.add(bi7);
        System.out.println(result == bi6);//false
        System.out.println(result == bi7);//false
        //此时，不会修改参与计算的BIgInteger的值，而是会重新创建一个对象

    }
}
