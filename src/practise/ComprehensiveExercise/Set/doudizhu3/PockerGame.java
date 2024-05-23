package practise.ComprehensiveExercise.Set.doudizhu3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PockerGame {

    //�ƺ�
    static ArrayList<String> list = new ArrayList<>();

    //����Ƶļ�ֵ
    static HashMap<String, Integer> hm = new HashMap<>();


    static {
        String[] color = {"A", "B", "C", "D"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String c : number) {
            for (String s : color) {
                list.add(s + c);
            }
        }
        list.add(" С��");//��������ȡ�ַ�����������
        list.add(" ����");

//        System.out.println(list);

        //����Ƶļ�ֵ
        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
        hm.put("С��", 16);
        hm.put("����", 17);

    }

    public PockerGame() {
        //ϴ��
        Collections.shuffle(list);


        //����
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            //������
            if (i <= 2) {
                lord.add(poker);
                continue;
            }

            //���������������
            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }
        }

//        System.out.println(list);
//        System.out.println(player1);
//        System.out.println(player2);
//        System.out.println(player3);

        //����
        order(lord);
        order(player1);
        order(player2);
        order(player3);


        //����
        lookPocker("����", lord);
        lookPocker("player1", player1);
        lookPocker("player2", player2);
        lookPocker("player3", player3);
    }

    public void order(ArrayList<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                //����o1��ɫ�ͼ�ֵ
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);
//                System.out.println(color1);


                //����o2��ɫ�ͼ�ֵ
                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);

                //�Ƚ�o1��o2�ļ�ֵ
                int i = value1 - value2;


                return i == 0 ? color1.compareTo(color2) : i;
            }
        });
    }

    //�����Ƶļ�ֵ
    /*
     *��������
     *����ֵ����ֵ
     */
    public int getValue(String pocker) { //A1
        String number1 = pocker.substring(1);    //��ȡ��ĩβ

        //�������
        if (hm.containsKey(number1)) {
            //���ؼ�ֵ
            return hm.get(number1);
        } else {
            //���������
            //�������ֱ�����ֵ
            return Integer.parseInt(number1);
        }
    }


    //����
    public void lookPocker(String name, ArrayList<String> list) {
        System.out.print(name + ":");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }

}