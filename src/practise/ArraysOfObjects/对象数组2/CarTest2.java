package practise.ArraysOfObjects.对象数组2;

import java.util.Scanner;

public class CarTest2 {
    public static void main(String[] args) {
        //1.创建一个数组用来存3辆汽车
        Car CarArr[] = new Car[3];
        //2.创建汽车对象，数据来自键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < CarArr.length; i++) {
            //创建汽车对象
            CarArr[i] = new Car();//在堆区创建三块空间并把方法区的成员变量拷贝到堆区，把成员方法在方法区的地址赋给堆区，然后把堆区的地址付给数组
            //录入品牌
            System.out.println("请输入第" + (i + 1) + "辆汽车的品牌");
            CarArr[i].setBrand(sc.next());
            //录入价格
            System.out.println("请输入第" + (i + 1) + "辆汽车的价格");
            CarArr[i].setPrice(sc.nextInt());
            //录入颜色
            System.out.println("请输入第" + (i + 1) + "辆汽车的颜色");
            CarArr[i].setColor(sc.next());
        }
        for (int i = 0; i < CarArr.length; i++) {
            System.out.println(CarArr[i].getBrand()+","+CarArr[i].getPrice()+","+CarArr[i].getColor());
        }



    }
}
