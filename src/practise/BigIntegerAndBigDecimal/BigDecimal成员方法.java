package practise.BigIntegerAndBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal��Ա���� {
    public static void main(String[] args) {
        BigDecimal b1 = BigDecimal.valueOf(4.445);
        BigDecimal b2 = BigDecimal.valueOf(2.0);

        // �ӷ�
        System.out.println("�ӷ���" + b1.add(b2));
        // ����
        System.out.println("������" + b1.subtract(b2));
        // �˷�
        System.out.println("�˷���" + b1.multiply(b2));
        //����
        System.out.println("������" + b1.divide(b2));
        //����
            System.out.println("������������λС������" + b1.divide(b2, 2, RoundingMode.HALF_UP));
    }
}
