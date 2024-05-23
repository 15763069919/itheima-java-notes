package practise.BigIntegerAndBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal成员方法 {
    public static void main(String[] args) {
        BigDecimal b1 = BigDecimal.valueOf(4.445);
        BigDecimal b2 = BigDecimal.valueOf(2.0);

        // 加法
        System.out.println("加法：" + b1.add(b2));
        // 减法
        System.out.println("减法：" + b1.subtract(b2));
        // 乘法
        System.out.println("乘法：" + b1.multiply(b2));
        //除法
        System.out.println("除法：" + b1.divide(b2));
        //除法
            System.out.println("除法（保留两位小数）：" + b1.divide(b2, 2, RoundingMode.HALF_UP));
    }
}
