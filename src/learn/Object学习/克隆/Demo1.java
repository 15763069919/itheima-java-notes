package learn.ObjectÑ§Ï°.¿ËÂ¡;

public class Demo1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
        User u1 = new User(1, "zhangsan", "123qwe", "gir111", data);

        System.out.println(u1.toString());
        //        u1.clone();     //err
        User u2 = (User) u1.clone();
        System.out.println(u2.toString());
    }
}
