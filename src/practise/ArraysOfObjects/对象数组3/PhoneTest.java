package practise.ArraysOfObjects.��������3;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        //1.��������
        Phone arr[] = new Phone[3];
        //2.�����ܽ��
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            //2.�����ֻ�����
            Phone p = new Phone();
            //3.���̸�ֵ
            Scanner sc = new Scanner(System.in);
            System.out.println("Ʒ�ƣ�");
            p.setBrand(sc.next());
            System.out.println("�۸�");
            p.setPrice(sc.nextInt());
            System.out.println("��ɫ��");
            p.setColor(sc.next());
            //4. ¼������
            arr[i] = p;
            //5. �����ܽ��
            sum += p.getPrice();
        }
        //5.����
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBrand()+","+arr[i].getPrice()+","+arr[i].getColor());
        }
        System.out.println("�����ֻ�ƽ���۸�Ϊ"+sum/arr.length);

    }


}
