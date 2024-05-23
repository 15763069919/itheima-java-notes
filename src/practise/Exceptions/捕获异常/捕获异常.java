package practise.Exceptions.捕获异常;

public class 捕获异常 {
    public static void main(String[] args) {
        //JVM默认处理方案：异常打印在控制台，并停止程序
      /*  int[] arr = {1,2,3,4,5,6};
        System.out.println(arr[10]);
        System.out.println("看看我执行了吗？");*/


        //捕获异常
        //不停止程序
        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(arr[10]);//此处吹出现了异常
                                        //程序在此处创建了一个异常ArrayIndexOutOfBoundsException的对象
                                        //new ArrayIndexOutOfBoundsException()
                                        //拿着这个对象去和catch小括号中的变量做对比，看看是否变量能接收这个对象
                                        //如果被接收，代表该异常被捕获，执行catch里面的代码
                                        //当catch里面的代码被执行完，他会执行try……catch体系下面的代码
        }catch(ArrayIndexOutOfBoundsException e){
            //如果出现了
            System.out.println("索引越界了");
        }
        System.out.println("看看我执行了吗？");
    }
}
