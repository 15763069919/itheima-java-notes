package practise.StringPractices;

import java.util.Scanner;

public class ���ת�� {
    public static void main(String[] args) {
        //1.����¼��
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("��������");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("�����Ч");
            }
        }

        //����һ������������ʾǮ�Ĵ�д
        String moneyStr = "";

        //2.�õ�money��ÿλ����,��ת������
        while (true) {
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            moneyStr = capitalNumber + moneyStr;
//            System.out.println(capitalNumber);
            money /= 10;
//            System.out.println(ge);
            if (money == 0)
                break;
        }

        //3.��ǰ�油��
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "��"+ moneyStr;
        }

        //4.���뵥λ
        String result = "";
        String arr[] = {"��","ʰ","��","Ǫ","��","ʰ","Ԫ"};
        for (int i = 0; i < moneyStr.length(); i++) {
            result += moneyStr.charAt(i) + arr[i];
        }
        System.out.println(result);
    }

    //1->Ҽ
    public static String getCapitalNumber(int number) {
        String arr[] = {"��", "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��"};
        return arr[number];
    }


}
