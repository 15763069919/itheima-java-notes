package practise.Thread.ThreadPool.getAvailableProcessors;

public class demo {
    public static void main(String[] args) {
        //向Java虚拟机返回可用处理器的数目
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);
    }
}
