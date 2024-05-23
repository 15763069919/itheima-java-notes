package practise.Exceptions.抛出处理;

public class demo1 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(getMax(arr));

        //空数组
        int[] nullArr = null;
        int max = 0;
        //使用try catch接收异常，防止程序停止
        try {
            max = getMax((nullArr));
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界异常");

        }
        System.out.println(max);

        //长度为0的数组
//        int[] emptyArr = {};
//        System.out.println(emptyArr);
    }

    public static int getMax(int[] arr) /*throws NullPointerException,ArrayIndexOutOfBoundsException*/{
        if(arr == null){
            //手动创建一个异常对象，并把这个异常交给方法的调用者
            //此语句会停止程序
            throw new NullPointerException();
        }
        if(arr.length==0){
            //手动创建一个异常对象，并把这个异常交给方法的调用者
            //此语句会停止程序
            throw new ArrayIndexOutOfBoundsException();
        }

        System.out.println("看看我执行了吗？");
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
