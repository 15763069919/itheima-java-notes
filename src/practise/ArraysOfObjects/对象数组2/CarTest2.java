package practise.ArraysOfObjects.��������2;

import java.util.Scanner;

public class CarTest2 {
    public static void main(String[] args) {
        //1.����һ������������3������
        Car CarArr[] = new Car[3];
        //2.�������������������Լ���¼��
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < CarArr.length; i++) {
            //������������
            CarArr[i] = new Car();//�ڶ�����������ռ䲢�ѷ������ĳ�Ա�����������������ѳ�Ա�����ڷ������ĵ�ַ����������Ȼ��Ѷ����ĵ�ַ��������
            //¼��Ʒ��
            System.out.println("�������" + (i + 1) + "��������Ʒ��");
            CarArr[i].setBrand(sc.next());
            //¼��۸�
            System.out.println("�������" + (i + 1) + "�������ļ۸�");
            CarArr[i].setPrice(sc.nextInt());
            //¼����ɫ
            System.out.println("�������" + (i + 1) + "����������ɫ");
            CarArr[i].setColor(sc.next());
        }
        for (int i = 0; i < CarArr.length; i++) {
            System.out.println(CarArr[i].getBrand()+","+CarArr[i].getPrice()+","+CarArr[i].getColor());
        }



    }
}
