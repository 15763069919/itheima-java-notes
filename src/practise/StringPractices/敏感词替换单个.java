package practise.StringPractices;

public class 敏感词替换单个 {
    public static void main(String[] args) {
        //1.获取到说的话
        String talk = "你玩的真好，以后不要再玩了，TMD";

        //2.把TMD替换成***
        String result = talk.replace("TMD","***");

        System.out.println(result);


    }
}
