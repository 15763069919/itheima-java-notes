package practise.ComprehensiveExercise.Set.doudizhu3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PockerGame {

    //牌盒
    static ArrayList<String> list = new ArrayList<>();

    //添加牌的价值
    static HashMap<String, Integer> hm = new HashMap<>();


    static {
        String[] color = {"A", "B", "C", "D"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String c : number) {
            for (String s : color) {
                list.add(s + c);
            }
        }
        list.add(" 小王");//解决下面截取字符串出现问题
        list.add(" 大王");

//        System.out.println(list);

        //添加牌的价值
        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
        hm.put("小王", 16);
        hm.put("大王", 17);

    }

    public PockerGame() {
        //洗牌
        Collections.shuffle(list);


        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            //发底牌
            if (i <= 2) {
                lord.add(poker);
                continue;
            }

            //三个玩家轮流发牌
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

        //排序
        order(lord);
        order(player1);
        order(player2);
        order(player3);


        //看牌
        lookPocker("底牌", lord);
        lookPocker("player1", player1);
        lookPocker("player2", player2);
        lookPocker("player3", player3);
    }

    public void order(ArrayList<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                //计算o1花色和价值
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);
//                System.out.println(color1);


                //计算o2花色和价值
                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);

                //比较o1和o2的价值
                int i = value1 - value2;


                return i == 0 ? color1.compareTo(color2) : i;
            }
        });
    }

    //计算牌的价值
    /*
     *参数：牌
     *返回值：价值
     */
    public int getValue(String pocker) { //A1
        String number1 = pocker.substring(1);    //截取到末尾

        //如果包含
        if (hm.containsKey(number1)) {
            //返回价值
            return hm.get(number1);
        } else {
            //如果不包含
            //返回数字本身即价值
            return Integer.parseInt(number1);
        }
    }


    //看牌
    public void lookPocker(String name, ArrayList<String> list) {
        System.out.print(name + ":");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }

}