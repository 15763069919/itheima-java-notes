package practise.ArraysOfObjects.��������2;

import java.util.Scanner;

public class CarTest1 {
    public static void main(String[] args) {
        //1.����һ������������3������
        Car CarArr[] = new Car[3];
        //2.�������������������Լ���¼��
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < CarArr.length; i++) {
            //������������
            Car c = new Car();//ÿһ�ζ��Ǵ�����һ���µĶ���
            //¼��Ʒ��
            System.out.println("�������" + (i + 1) + "��������Ʒ��");
            c.setBrand(sc.next());
            //¼��۸�
            System.out.println("�������" + (i + 1) + "�������ļ۸�");
            c.setPrice(sc.nextInt());
            //¼����ɫ
            System.out.println("�������" + (i + 1) + "����������ɫ");
            c.setColor(sc.next());
            //3.��������
            CarArr[i] = c;
        }
        for (int i = 0; i < CarArr.length; i++) {
            System.out.println(CarArr[i].getBrand()+","+CarArr[i].getPrice()+","+CarArr[i].getColor());
        }



    }
}
