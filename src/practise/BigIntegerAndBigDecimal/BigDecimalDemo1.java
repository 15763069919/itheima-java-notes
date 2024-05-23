package practise.BigIntegerAndBigDecimal;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        //通过传递double类型的小数来创建对象
        //不精确
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);

        System.out.println(bd1);
        System.out.println(bd2);

        //通过传递字符串来创建对象
        //精确
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");

        System.out.println(bd3);
        System.out.println(bd4);

        System.out.println(bd3.add(bd4));


    }
}
