package practise.ComprehensiveExercise.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class demo4 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> city1 = new ArrayList<>();
        ArrayList<String> city2 = new ArrayList<>();
        ArrayList<String> city3 = new ArrayList<>();

        Collections.addAll(city1, "�Ͼ�", "����", "����", "����", "����");
        Collections.addAll(city2, "�人", "Т��", "ʮ��", "�˲�", "����");
        Collections.addAll(city3, "ʯ��ׯ", "��ɽ", "��̨", "����", "�żҿ�");

        hm.put("����ʡ", city1);
        hm.put("����ʡ", city2);
        hm.put("�ӱ�ʡ", city3);

        hm.forEach((String s, ArrayList<String> strings) -> {
            System.out.print(s + " = ");
            for (int i = 0; i < strings.size(); i++) {
                if (i == strings.size() - 1) {
                    System.out.print(strings.get(i));
                } else {
                    System.out.print(strings.get(i) + "��");
                }
            }
            System.out.println();
        });


    }
}
