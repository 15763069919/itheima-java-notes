package classPractise;

public class Á½²ãforµÄ½×³Ë {
    public static void main(String[] args) {
        double result1 = 0;
        for (int i = 1; i <= 20; i++) {
            result1 += 1.0/f(i);
        }
        System.out.println("sum="+(double)result1);

        double result2 = 0;
        int index = 1;
        do {
            result2 += 1.0/f(index);
            index++;
        }
        while(index<=20);
        System.out.println("sum="+(double)result2);
    }
    public static double f(int x){
        double sum = 1;
        while(x>0){
            sum *= x;
            x--;
        }
        return sum;
    }

}
