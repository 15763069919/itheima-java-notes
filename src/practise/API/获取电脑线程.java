package practise.API;

public class 获取电脑线程 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors()+" 线程");
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024/1024+" GB");
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024+" MB");
    }
}
