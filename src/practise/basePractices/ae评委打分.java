package practise.basePractices;

import java.util.Scanner;

public class ae��ί��� {
    /*
    ����:
    �ڳ�������У���6����ί��ѡ�ִ�֣�������Χ��[0-100]֮���������
    ѡ�ֵ����÷�Ϊ:ȥ����߷֡���ͷֺ��4����ί��ƽ���֣�������������̲������ѡ�ֵĵ÷֣�
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score[] = new int[6];
        int averageScore = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Please enter six scores!"+"(����:"+(i+1)+"/"+score.length+")");
            score[i] = sc.nextInt();
        }
        // ����
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
