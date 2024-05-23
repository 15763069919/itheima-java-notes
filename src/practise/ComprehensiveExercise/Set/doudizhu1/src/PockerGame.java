package practise.ComprehensiveExercise.Set.doudizhu1.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class PockerGame {


    //�ƺ�
    static ArrayList<String> list = new ArrayList<>();

    static {
        //׼����
        String[] color = {"meihua", "hietao", "hongtao", "fangkuai"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //װ��
        for (String s : color) {
            for (String string : number) {
                list.add(s + string);
            }
        }
        list.add("С��");
        list.add("����");

        System.out.println(list);

    }


    public PockerGame() {
        //ϴ��
        Collections.shuffle(list);

        //����
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

        //����
        lookPocker("����",lord);
        lookPocker("���1",play1);
        lookPocker("���2",play2);
        lookPocker("���3",play3);


    }


    /*
    ����һ���������
    ��������ÿλ��ҵ���
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
