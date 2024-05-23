package practise.StringAdvancedPractices;
/*
 * ����¼��һ���ַ�����Ҫ��1������<=9 Ҫ��2��ֻ�������֣�������ת����������֣�0ת���ɳ���Ϊ0���ַ���
*/

import java.util.Scanner;

public class ת���������� {
    public static void main(String[] args) {
        String str;
        while (true) {
            //��ȡ�����ַ���
            System.out.println("�������ַ�����");
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            //�ж��ַ����Ƿ�Ϸ�
            if (checkStr(str)) break;
            else {
                System.out.println("���벻�Ϸ���");
                continue;
            }
        }

        //����һ����д�����������ַ���
        changeLuoMa(str);
        System.out.println(changeLuoMa(str));

        //������������
        for (int i = 0; i < str.length(); i++) {
            //charAt�õ�����ֻ���ַ����������������֣���Ҫ��ȥ�ַ���0���õ�����
            System.out.print(changeLuoMa(str.charAt(i)-'0'));
        }
        System.out.println();

        //����������ΰ
        for (int i = 0; i < str.length(); i++) {
            System.out.print(changeLuoMa(str.charAt(i)));
        }
        System.out.println();

        //�����ġ���д
        System.out.println(changeLuoMa2(str));
    }

    public static boolean checkStr(String str) {
        //����С��9
        if (str.length() > 9) return false;
        //ȫ��Ϊ����
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > '9' || str.charAt(i) < '0') return false;
        }
        return true;
    }

    //����һ����д
    //����һ���ַ�����ͨ���������ַ�������������StringBuilder�����toString�����ַ���
    public static String changeLuoMa(String str) {
        String[] arr = {"","��", "��", "��", "��", "��", "��", "��", "��","��"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(arr[str.charAt(i) - '0']);
        }
        return sb.toString();
    }

    //����������ΰ
    //ֱ�ӽ����ַ�������������֮�����ϰ
    public static String changeLuoMa(int number){
        String[] arr = {"","��", "��", "��", "��", "��", "��", "��", "��","��"};
        return arr[number];
    }

    //����������ΰ
    //ͨ�������ַ�����ֱ��ת������������
    public static String changeLuoMa(char number){
        String str = switch (number){
            case '0' -> str = "";
            case '1' -> str = "��";
            case '2' -> str = "��";
            case '3' -> str = "��";
            case '4' -> str = "��";
            case '5' -> str = "��";
            case '6' -> str = "��";
            case '7' -> str = "��";
            case '8' -> str = "��";
            case '9' -> str = "��";
            default -> str = "";
        };
        return str;
    }

    //�����ġ���д
    //ͨ��String��replace�����滻Ϊ��������
    public static String changeLuoMa2(String str){
        String[] arr = {"","��", "��", "��", "��", "��", "��", "��", "��","��"};
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.replace(str,arr[str.charAt(i)-'0']);
        }
        return result;
    }

}

