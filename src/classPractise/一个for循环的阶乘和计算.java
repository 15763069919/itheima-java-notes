package classPractise;
/*
    1!+2!+...+10!
 */
public class 一个for循环的阶乘和计算 {
    public static void main(String[] args) {
        double result = 0;
        double num = 1;
        for (int i = 1; i <= 10; i++) {
            num *= i;
            result += num;
        }
        System.out.println(result);
    }
}
