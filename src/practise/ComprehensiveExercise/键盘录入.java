package practise.ComprehensiveExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class ����¼�� {
    /*
    ����¼��1~100֮�������������ӵ����ϣ�ֱ�������������ݺͳ���200Ϊֹ
     */
    public static void main(String[] args) {
//        extracted();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            System.out.println("������һ������");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);

            if(num<1||num>100){
                System.out.println("��ǰ���ֲ���1~100��Χ��");
                continue;
            }else {
                //�������Զ�װ�䣬��Ϊ���ϲ��ܴ������������
                list.add(num);
            }
            //ͳ�����ݺ�
            int sum = getSum(list);
            if(sum>200){
                System.out.println("����Ԫ�غʹ���200���洢��ֹͣ");
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            //�Զ����䣺String  -> int
            sum += list.get(i);
        }
        return sum;
    }

    private static void extracted() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String num = sc.nextLine();
            sum += Integer.parseInt(num);

            list.add(num);

            if (sum == 200) {
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
