package practise.ArrayList.����ֻ����󲢷���Ҫ�������;

import java.util.ArrayList;

/*
���ؼ۸�С��3000��
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("С��", 1000);
        Phone p2 = new Phone("ƻ��", 8000);
        Phone p3 = new Phone("����", 2999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        /*System.out.println("�۸����3000���ֻ���ϢΪ��");
        priceBelow(list,3000);*/
        for (int i = 0; i < priceBelow(list).size(); i++) {
            System.out.println(priceBelow(list).get(i).getBrand()+","+priceBelow(list).get(i).getPrice());

        }
    }

    //��ӡ����3000��
    /*public static void priceBelow(ArrayList<Phone> list,double price){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice()<3000){
                System.out.println(list.get(i).getBrand()+","+list.get(i).getPrice());
            }
        }
    }*/
    public static ArrayList<Phone> priceBelow(ArrayList<Phone> list) {
        ArrayList<Phone> Below3000 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000) {
                Below3000.add(list.get(i));
            }
        }
        return Below3000;
    }
}
