package practise.ArraysOfObjects.对象数组2;

import java.util.Scanner;

public class CarTest1 {
    public static void main(String[] args) {
        //1.创建一个数组用来存3辆汽车
        Car CarArr[] = new Car[3];
        //2.创建汽车对象，数据来自键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < CarArr.length; i++) {
            //创建汽车对象
            Car c = new Car();//每一次都是创建了一个新的对象
            //录入品牌
            System.out.println("请输入第" + (i + 1) + "辆汽车的品牌");
            c.setBrand(sc.next());
            //录入价格
            System.out.println("请输入第" + (i + 1) + "辆汽车的价格");
            c.setPrice(sc.nextInt());
            //录入颜色
            System.out.println("请输入第" + (i + 1) + "辆汽车的颜色");
            c.setColor(sc.next());
            //3.存入数组
            CarArr[i] = c;
        }
        for (int i = 0; i < CarArr.length; i++) {
            System.out.println(CarArr[i].getBrand()+","+CarArr[i].getPrice()+","+CarArr[i].getColor());
        }



    }
}
