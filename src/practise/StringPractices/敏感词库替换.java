package practise.StringPractices;

public class 敏感词库替换 {
    public static void main(String[] args) {
        //1.获取到说的话
        String talk = "你玩的真好，以后不要再玩了，TMD，CNM";

        //2.定义一个敏感词库
        String arr[]={"TMD","CNM","SB","MLGB"};

        //3.循环
        String result;
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}
