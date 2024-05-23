package learn.StringBuilder;

public class 常用方法 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder("abc");

        //2.添加元素    append
        sb.append(1);
        sb.append(2.3);
        sb.append(true);

        //打印 StringBuilder 定义的对象的时候，
        // 因为 StringBuilder 是 Java 已经写好的类，
        // 打印对象不是地址值而是属性值

        System.out.println(sb); //abc12.3true


        //3.反转数据    reverse
        sb.reverse();
        System.out.println(sb); //eurt3.21cba

        //4.获取长度    length
        int len = sb.length();
        System.out.println("长度为"+len);

        //5.StringBuilder -> 学习.String     toString
        String str = sb.toString();
        System.out.println(str);

    }
}
