package practise.basePractices;

import java.util.Scanner;

public class ab���ɻ�Ʊ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("�������Ʊԭ��:");
        double price = sc.nextInt();
        System.out.println("�������·�:");
        int month = sc.nextInt();
        System.out.println("��������յȼ����(0ͷ�Ȳ�,1���ò�):");
        int cabinClass = sc.nextInt();

        discount(price, month, cabinClass);
    }

    public static void discount(double price, int month, int cabinClass) {
        if(price<=0)
            System.out.println("����¼��۸񲻺Ϸ�!(�۸���Ϊ��ֵ)");
        switch (month) {
            case 5, 6, 7, 8, 9, 10:
            {
                if (cabinClass == 0)
                {
                    price *= 0.9;
                    System.out.println("The preferential price is: " + price + "!");
                }
                else if (cabinClass == 1)
                {
                    price *= 0.85;
                    System.out.println("The preferential price is: " + price + "!");
                }
                else
                    System.out.println("����¼����յȼ����Ϸ�!(�޴˲�λ)");
                break;
            }
            case 11, 12, 1, 2, 3, 4:
            {
                if (cabinClass == 0)
                {
                    price *= 0.7;
                    System.out.println("The preferential price is: " + price + "!");
                }
                else if (cabinClass == 1)
                {
                    price *= 0.65;
                    System.out.println("The preferential price is: " + price + "!");
                }
                else System.out.println("����¼����յȼ����Ϸ�!(�޴˲�λ)");
                break;
            }
            default:System.out.println("����¼���·ݲ��Ϸ�!(�޴��·�)");
        }
    }
}
