package learn;
import java.util.Scanner;
public class ·½·¨ÖØÔØ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

    }

    public static void compare(byte a, byte b) {
        if (a > b)
            System.out.println(a + ">" + b);
        else if (a < b)
            System.out.println(a + "<" + b);
    }

    public static void compare(int a, int b){
        if (a > b)
            System.out.println(a + ">" + b);
        else if (a < b)
            System.out.println(a + "<" + b);
    }
    public static void compare(short a, short b){
        if (a > b)
            System.out.println(a + ">" + b);
        else if (a < b)
            System.out.println(a + "<" + b);
    }
    public static void compare(long a, long b){
        if (a > b)
            System.out.println(a + ">" + b);
        else if (a < b)
            System.out.println(a + "<" + b);
    }

}
