package practise.ListAndMap.可变参数;

public class Demo1 {
    public static void main(String[] args) {


    }

    public static int getSum(int... args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }
}
