package practise.Stream流;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

public class demo2 {
    public static void main(String[] args) {


        //单列集合
        //
        System.out.println("======================单列集合========================");
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        Collections.addAll(list, "A", "B", "C", "D", "E");
        //获取到一条流水线，并把集合放在流水线上
        Stream<String> stream1 = list.stream();
        //使用流水线终结方法，打印一条流水线上的所有数据
        stream1.forEach(System.out::println);


        //双列集合
        //
        System.out.println("=====================双列集合==========================");
        //创建集合
        HashMap<String, Integer> hm = new HashMap<>();
        //添加元素
        hm.put("aaa", 111);
        hm.put("bbb.txt", 222);
        hm.put("ccc", 333);
        hm.put("ddd", 444);
        //第一种获取流水线
        System.out.println("---------------第一种获取流水线----------------");

        hm.keySet().stream().forEach(System.out::println);
        //第二种获取流水线
        System.out.println("---------------第二种获取流水线----------------");

        hm.entrySet().stream().forEach(System.out::println);


        //数组
        //
        System.out.println("=====================数组==========================");
        //创建数组
        System.out.println("---------------int[]----------------");

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("---------------String[]----------------");

        String[] str = {"a", "directory","c"};
        Arrays.stream(str).forEach(System.out::println);

        //一堆零散的数据（必须要同种数据类型）
        //
        System.out.println("=====================一堆零散的数据==========================");
        //创建
        System.out.println("---------------1----------------");
        Stream.of(1,2,3,4,5).forEach(System.out::println);

        System.out.println("---------------2----------------");
        Stream.of("a", "directory","c","d","e").forEach(System.out::println);

    }


}
