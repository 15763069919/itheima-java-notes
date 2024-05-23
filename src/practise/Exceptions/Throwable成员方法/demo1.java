package practise.Exceptions.Throwable成员方法;

public class demo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage()); //将异常的简短描述打印在控制台
            System.out.println(e.toString());   //将异常转为字符串打印在控制台
            e.printStackTrace();    //仅仅是以红色的字体将异常打印在控制台，不会停止程序
        }

        System.out.println("看看我执行了吗？");

        //正常输出语句
        System.out.println(123);
        //用来打印错误信息的输出语句
        System.err.println(123);
    }
}
