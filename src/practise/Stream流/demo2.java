package practise.Stream��;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

public class demo2 {
    public static void main(String[] args) {


        //���м���
        //
        System.out.println("======================���м���========================");
        //��������
        ArrayList<String> list = new ArrayList<>();
        //���Ԫ��
        Collections.addAll(list, "A", "B", "C", "D", "E");
        //��ȡ��һ����ˮ�ߣ����Ѽ��Ϸ�����ˮ����
        Stream<String> stream1 = list.stream();
        //ʹ����ˮ���ս᷽������ӡһ����ˮ���ϵ���������
        stream1.forEach(System.out::println);


        //˫�м���
        //
        System.out.println("=====================˫�м���==========================");
        //��������
        HashMap<String, Integer> hm = new HashMap<>();
        //���Ԫ��
        hm.put("aaa", 111);
        hm.put("bbb.txt", 222);
        hm.put("ccc", 333);
        hm.put("ddd", 444);
        //��һ�ֻ�ȡ��ˮ��
        System.out.println("---------------��һ�ֻ�ȡ��ˮ��----------------");

        hm.keySet().stream().forEach(System.out::println);
        //�ڶ��ֻ�ȡ��ˮ��
        System.out.println("---------------�ڶ��ֻ�ȡ��ˮ��----------------");

        hm.entrySet().stream().forEach(System.out::println);


        //����
        //
        System.out.println("=====================����==========================");
        //��������
        System.out.println("---------------int[]----------------");

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("---------------String[]----------------");

        String[] str = {"a", "directory","c"};
        Arrays.stream(str).forEach(System.out::println);

        //һ����ɢ�����ݣ�����Ҫͬ���������ͣ�
        //
        System.out.println("=====================һ����ɢ������==========================");
        //����
        System.out.println("---------------1----------------");
        Stream.of(1,2,3,4,5).forEach(System.out::println);

        System.out.println("---------------2----------------");
        Stream.of("a", "directory","c","d","e").forEach(System.out::println);

    }


}
