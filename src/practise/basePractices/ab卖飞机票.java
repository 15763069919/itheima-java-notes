package practise.basePractices;

import java.util.Scanner;

public class ab卖飞机票 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价:");
        double price = sc.nextInt();
        System.out.println("请输入月份:");
        int month = sc.nextInt();
        System.out.println("请输入机舱等级序号(0头等舱,1经济舱):");
        int cabinClass = sc.nextInt();

        discount(price, month, cabinClass);
    }

    public static void discount(double price, int month, int cabinClass) {
        if(price<=0)
            System.out.println("键盘录入价格不合法!(价格不能为负值)");
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
                    System.out.println("键盘录入机舱等级不合法!(无此舱位)");
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
                else System.out.println("键盘录入机舱等级不合法!(无此舱位)");
                break;
            }
            default:System.out.println("键盘录入月份不合法!(无此月份)");
        }
    }
}
