package practise.BigIntegerAndBigDecimal;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        //ͨ������double���͵�С������������
        //����ȷ
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);

        System.out.println(bd1);
        System.out.println(bd2);

        //ͨ�������ַ�������������
        //��ȷ
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");

        System.out.println(bd3);
        System.out.println(bd4);

        System.out.println(bd3.add(bd4));


    }
}
