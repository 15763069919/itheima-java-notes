package classPractise;
/*
    1!+2!+...+10!
 */
public class һ��forѭ���Ľ׳˺ͼ��� {
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
