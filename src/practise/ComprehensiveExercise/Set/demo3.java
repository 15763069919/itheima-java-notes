package practise.ComprehensiveExercise.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class demo3 {
    public static void main(String[] args) {
        //��¼��������ѧ������
        ArrayList<String> list1 = new ArrayList<>();
        //��¼�ѵ�����ѧ������
        ArrayList<String> list2 = new ArrayList<>();
        //���Ԫ��
        Collections.addAll(list1, "zhangsan", "lisi", "wnagwu", "zhaoliu", "zhengqi", "chenba", "dujiu", "sunshi");


        for (int i = 0; i < 10; i++) {
            System.out.println("=============��"+(i+1)+"�ֵ�����ʼ��===============");
            //��¼ѧ������
            int nums = list1.size();
            Random r = new Random();

            for (int j = 0; j < nums; j++) {
                int index = r.nextInt(list1.size());
                String name = list1.remove(index);
                list2.add(name);
                System.out.println(name);
            }
//        System.out.println(list1);
//        System.out.println(list2);
            list1.addAll(list2);
            list2.clear();
        }









       /* ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            //���Ԫ��
            Collections.addAll(list, "zhangsan", "lisi", "wnagwu", "zhaoliu", "zhengqi", "chenba", "dujiu", "sunshi");
            //����
            Collections.shuffle(list);
            //��¼����
            int length = list.size();

            System.out.println("������ʼ");

            for (int i = 0; i < length; i++) {
                while(true) {
                    String s = sc.nextLine();
                    if (s.equals("1")){
                        break;
                    }else if(s.contains("#")){
                        System.out.println("��������");
                        System.exit(0);
                    }
                }
                System.out.println(list.remove(0));
            }
            if(list.isEmpty())
                System.out.println("���������ѵ��꣬����ʼ���µ���");
        } while (list.isEmpty());*/
    }
}
