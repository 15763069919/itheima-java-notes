package practise.ComprehensiveExercise.Set.doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.function.Consumer;

public class PockerGame {


    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();


    static {

        String[] color = {"mh", "ht", "Ht", "fk"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int serialNumber = 1;
        for (String n : number) {
            for (String s : color) {
                hm.put(serialNumber, s + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;

        hm.put(serialNumber, "大王");
        list.add(serialNumber);

//        System.out.println(hm);
//        System.out.println(list);
    }

    public PockerGame() {
        //洗牌
        Collections.shuffle(list);

        //发牌
        TreeSet<Integer> load = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            Integer serialNumber = list.get(i);
            if (i <= 2) {
                load.add(serialNumber);
                continue;
            } else if (i % 3 == 1) {
                player1.add(serialNumber);
            } else if (i % 3 == 2) {
                player2.add(serialNumber);
            } else {
                player3.add(serialNumber);
            }
        }


//      System.out.println(load);
//      System.out.println(player1);
//      System.out.println(player2);
//      System.out.println(player3);

        lookPocker("底牌", load);
        lookPocker("player1", player1);
        lookPocker("player2", player2);
        lookPocker("player3", player3);

    }

    /*
     * 参数1：玩家名称
     * 参数2：玩家牌的序号
     */

    public void lookPocker(String name, TreeSet<Integer> ts) {
        System.out.print(name + ":");
        ts.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(hm.get(integer) + " ");
            }
        });
        System.out.println();
    }

}
