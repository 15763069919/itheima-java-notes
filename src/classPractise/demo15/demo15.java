package classPractise.demo15;

public class demo15 {

    public static void main(String args[]) {
        A a = new A();
        int m = a.add(12, 6);
        int n = Com.get(12);
        int t = a.see(6);
        int q = a.look(6);
        System.out.printf("%d:%d:%d:%d", m, n, t, q);  //¡¾´úÂë¡¿
    }
}

interface Com {
    int add(int a, int b);

    public static int get(int n) {
        return n;
    }

    public default int see(int n) {
        return n;
    }

    public default int look(int n) {
        return n;
    }
}

class A implements Com {
    public int add(int a, int b) {
        return a + b;
    }

    public int see(int n) {
        return n + 1;
    }
}