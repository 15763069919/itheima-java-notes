package algorithm;

public class AA回文数判断算法 {
    public static void main(String[] args) {
        //思路:   1.把数倒过来 2.比较是否一样
        int x = 12345;
        int num = 0;
        while(x!=0)
        {
            int ge = x % 10;    //取余,即取每个数的个位数
            x = x / 10; //java中整数除以整数仍是整数,即去掉个位数
            num = num * 10 + ge;    //把每个个位数变为十位,百位,千位,万位
        }
        System.out.println(num);
    }
}
