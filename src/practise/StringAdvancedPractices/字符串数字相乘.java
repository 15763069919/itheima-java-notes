package practise.StringAdvancedPractices;

public class �ַ���������� {
    public static void main(String[] args) {
        String num1 = "1234";
        String num2 = "123";
        System.out.println(multiply(num1, num2));
    }
    public static int changeInt(String num){
        int number1 = 0;
        for (int i = 0; i < num.length(); i++) {
            if (i != num.length()-1) {
                number1 += num.charAt(i) - '0';
                number1 *= 10;
            } else
                number1 += num.charAt(i) - '0';
        }
        return number1;
    }
    public static String multiply(String num1, String num2) {
        //��num1�е��ַ���ת��Ϊ����
        int number1 = changeInt(num1);
        //��num2�е��ַ���ת��Ϊ����
        int number2 = changeInt(num2);

        return (number1*number2)+"";
    }
}

