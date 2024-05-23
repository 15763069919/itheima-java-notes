package practise.Exceptions.捕获异常;

public class 灵魂四问 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        try {
            System.out.println(arr[10]);
            System.out.println(2/0);
            System.out.println("看看我执行了吗1");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }
        System.out.println("看看我执行了吗2");
    }
}
