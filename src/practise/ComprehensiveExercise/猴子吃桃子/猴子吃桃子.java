package practise.ComprehensiveExercise.猴子吃桃子;

public class 猴子吃桃子 {
    public static void main(String[] args) {

        System.out.println(method(1));
    }
    private static int method(int day){
        if(day <= 0 ||day >= 11)return -1;
        if(day == 10 )
            return 1;
        return (method(day+1)+1)*2;
    }
}
