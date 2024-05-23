package practise.basePractices;

import java.util.Scanner;

public class ae评委打分 {
    /*
    需求:
    在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。
    选手的最后得分为:去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分，
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score[] = new int[6];
        int averageScore = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Please enter six scores!"+"(进度:"+(i+1)+"/"+score.length+")");
            score[i] = sc.nextInt();
        }
        // 排序
        for (int i = 0; i < score.length; i++) {
            for(int j=0;j<score.length-1-i;j++){
                if(score[j]>score[j+1]){
                    int temp = score[j];
                    score[j]=score[j+1];
                    score[j+1]=temp;
                }
            }
        }
        averageScore = (score[1]+score[2]+score[3]+score[4])/4;
        System.out.println(averageScore);
    }


}
