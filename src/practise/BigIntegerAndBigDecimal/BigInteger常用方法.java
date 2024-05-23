package practise.BigIntegerAndBigDecimal;

import java.math.BigInteger;
import java.util.Arrays;

public class BigInteger常用方法 {
    public static void main(String[] args) {
        BigInteger b1 = BigInteger.valueOf(10);
        BigInteger b2 = BigInteger.valueOf(5);

        System.out.println("b1+b2="+b1.add(b2));
        System.out.println("b1-b2="+b1.subtract(b2));
        System.out.println("b1*b2="+b1.multiply(b2));
        System.out.println("b1/b2="+b1.divide(b2));
        System.out.println(Arrays.toString(b1.divideAndRemainder(b2)));
        System.out.println("b1比较b2="+b1.equals(b2));
        System.out.println("b1^2="+b1.pow(2));
        System.out.println("大="+b1.max(b2));
        System.out.println("小="+b1.min(b2));
        System.out.println("int="+b1.intValue());
        System.out.println("long="+b1.longValue());
        System.out.println("double="+b1.doubleValue());

    }
}
