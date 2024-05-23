package learn.重新认识main方法;

public class 重新认识main方法 {
    public static void main(String[] args) {
        args[0] = "System.out.println(helloworld);";


        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
