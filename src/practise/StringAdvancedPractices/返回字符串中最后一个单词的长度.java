package practise.StringAdvancedPractices;

public class �����ַ��������һ�����ʵĳ��� {
    public static void main(String[] args) {
        System.out.println("������һ���ַ�����");
        String str = new java.util.Scanner(System.in).nextLine();
        System.out.println("�ַ��������һ�����ʵĳ���Ϊ��" + tailWordLength(str));
    }

    public static int tailWordLength(String str) {
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ')
                count++;
            else
                break;
        }
        return count;


    }
}