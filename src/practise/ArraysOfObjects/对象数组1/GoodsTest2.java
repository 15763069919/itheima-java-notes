package practise.ArraysOfObjects.对象数组1;

public class GoodsTest2 {
    public static void main(String[] args) {
        //1.创建一个数组
        Goods arr[] = new Goods[3];

        //2.创建三个商品对象；
       arr[0]= new Goods("001"," 华为P40",5999.0,100);
       arr[1]= new Goods("002"," 保温杯",227.0,50);
       arr[2]= new Goods("003"," 枸杞",12.7,70);

//        //3.把商品添加到数组中
//        arr[0]=g1;
//        arr[1]=g2;
//        arr[2]=g3;

        //4.遍历
        for (int i = 0; i < arr.length; i++) {
            //i 索引，arr[i]元素
            System.out.println(arr[i].getId()+","+arr[i].getName()+","+arr[i].getPrice()+","+arr[i].getCount());
        }



    }
}
