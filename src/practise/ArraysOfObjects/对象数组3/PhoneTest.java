package practise.ArraysOfObjects.对象数组3;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        //1.创建数组
        Phone arr[] = new Phone[3];
        //2.创建总金额
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            //2.创建手机对象
            Phone p = new Phone();
            //3.键盘赋值
            Scanner sc = new Scanner(System.in);
            System.out.println("品牌？");
            p.setBrand(sc.next());
            System.out.println("价格？");
            p.setPrice(sc.nextInt());
            System.out.println("颜色？");
            p.setColor(sc.next());
            //4. 录入数组
            arr[i] = p;
            //5. 计算总金额
            sum += p.getPrice();
        }
        //5.遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBrand()+","+arr[i].getPrice()+","+arr[i].getColor());
        }
        System.out.println("三部手机平均价格为"+sum/arr.length);

    }


}
