package practise.ComprehensiveExercise.Set.doudizhu1.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class PockerGame {


    //牌盒
    static ArrayList<String> list = new ArrayList<>();

    static {
        //准备牌
        String[] color = {"meihua", "hietao", "hongtao", "fangkuai"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //装牌
        for (String s : color) {
            for (String string : number) {
                list.add(s + string);
            }
        }
        list.add("小王");
        list.add("大王");

        System.out.println(list);

    }


    public PockerGame() {
        //洗牌
        Collections.shuffle(list);

        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String pocker = list.get(i);
            if (i <= 2) {
                lord.add(pocker);
                continue;
            } else if (i % 3 == 0) {
                play1.add(pocker);
            } else if (i % 3 == 1) {
                play2.add(pocker);
            } else {
                play3.add(pocker);
            }
        }

        //看牌
        lookPocker("底牌",lord);
        lookPocker("玩家1",play1);
        lookPocker("玩家2",play2);
        lookPocker("玩家3",play3);


    }


    /*
    参数一：玩家名字
    参数二：每位玩家的牌
     */
    public void lookPocker(String name,ArrayList<String> list){
        System.out.print(name+":");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s+" ");

            }
        });
        System.out.println();
    }



}
