package practise.ArraysOfObjects.��������1;

public class GoodsTest2 {
    public static void main(String[] args) {
        //1.����һ������
        Goods arr[] = new Goods[3];

        //2.����������Ʒ����
       arr[0]= new Goods("001"," ��ΪP40",5999.0,100);
       arr[1]= new Goods("002"," ���±�",227.0,50);
       arr[2]= new Goods("003"," ���",12.7,70);

//        //3.����Ʒ��ӵ�������
//        arr[0]=g1;
//        arr[1]=g2;
//        arr[2]=g3;

        //4.����
        for (int i = 0; i < arr.length; i++) {
            //i ������arr[i]Ԫ��
            System.out.println(arr[i].getId()+","+arr[i].getName()+","+arr[i].getPrice()+","+arr[i].getCount());
        }



    }
}
