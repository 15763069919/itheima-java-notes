package practise.ComprehensiveExercise.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class demo3 {
    public static void main(String[] args) {
        //记录待点名的学生姓名
        ArrayList<String> list1 = new ArrayList<>();
        //记录已点名的学生姓名
        ArrayList<String> list2 = new ArrayList<>();
        //添加元素
        Collections.addAll(list1, "zhangsan", "lisi", "wnagwu", "zhaoliu", "zhengqi", "chenba", "dujiu", "sunshi");


        for (int i = 0; i < 10; i++) {
            System.out.println("=============第"+(i+1)+"轮点名开始啦===============");
            //记录学生总数
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
            //添加元素
            Collections.addAll(list, "zhangsan", "lisi", "wnagwu", "zhaoliu", "zhengqi", "chenba", "dujiu", "sunshi");
            //打乱
            Collections.shuffle(list);
            //记录长度
            int length = list.size();

            System.out.println("点名开始");

            for (int i = 0; i < length; i++) {
                while(true) {
                    String s = sc.nextLine();
                    if (s.equals("1")){
                        break;
                    }else if(s.contains("#")){
                        System.out.println("点名结束");
                        System.exit(0);
                    }
                }
                System.out.println(list.remove(0));
            }
            if(list.isEmpty())
                System.out.println("所有姓名已点完，将开始重新点名");
        } while (list.isEmpty());*/
    }
}
