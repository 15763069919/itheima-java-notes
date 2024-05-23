package practise.ComprehensiveExercise.ÅÀÂ¥Ìİ;

public class ÅÀÂ¥Ìİ {
    public static void main(String[] args) {
        System.out.println(method(20));
    }

    private static int method(int stairs){
        if(stairs == 1)
            return 1;
        if(stairs == 2)
            return 2;
        return method(stairs-1)+method(stairs-2);
    }
}
