package practise.ListAndMap.Map.HashMap.eg2;

import java.util.*;

public class demo2 {
    public static void main(String[] args) {

        //ͶƱ
        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(0, 4);
            list.add(arr[index]);
        }

        //ͳ��
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String name : list) {
            if(hashMap.containsKey(name)){
                //��ȡ��ǰ����
                Integer count = hashMap.get(name);
                //����
                count++;
                //��������
                hashMap.put(name,count);
            }else {
                hashMap.put(name,1);
            }
        }
        System.out.println(hashMap);


        //�����ֵ
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        int max = 0;
        for(Map.Entry entry: entries){
            int value = (int) entry.getValue();
            if(max < value)
                max = value;
        }
        System.out.println(max);

        //�ҵ�����Ϊ���ֵ�ľ���
        for(Map.Entry entry: entries){
           if((int) entry.getValue() == max ){
               System.out.println(entry.getKey());
           }
        }
    }
}
