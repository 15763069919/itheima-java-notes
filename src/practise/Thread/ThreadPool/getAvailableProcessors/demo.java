package practise.Thread.ThreadPool.getAvailableProcessors;

public class demo {
    public static void main(String[] args) {
        //��Java��������ؿ��ô���������Ŀ
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);
    }
}
