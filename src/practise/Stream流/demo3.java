package practise.Stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张良", "王二麻子", "谢广坤");

        //filter 过滤
        System.out.println("==================filter=====================");
        //
       /* list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {

                return s.startsWith("张");//返回值表示要还是不要，ture留下，false舍弃
            }
        }).forEach(System.out::println);*/

        //s表示依次获取每一个数据
        list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);

        //limit 获取前几个元素
        //
        System.out.println("==================limit=====================");
        list.stream().limit(3).forEach(System.out::println);

        //skip 跳过
        //
        System.out.println("==================skip=====================");
        list.stream().skip(4).forEach(System.out::println);

        //distinct 元素去重，依赖（hashCode和equals方法）
        //
        System.out.println("==================distinct=====================");
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌", "张无忌", "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张良", "王二麻子", "谢广坤");

        list1.stream().distinct().forEach(name -> System.out.println(name));


        //concat   合并a和b两个流为一个流
        //
        System.out.println("==================concat=====================");
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        Collections.addAll(list3, "张无忌", "张无忌", "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张良", "王二麻子", "谢广坤");
        Collections.addAll(list4, "张无忌", "张无忌", "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张良", "王二麻子", "谢广坤");

        Stream.concat(list3.stream(), list4.stream()).forEach(System.out::println);

        System.out.println("==================map=====================");
        ArrayList<String> list5 = new ArrayList<>();
        Collections.addAll(list5, "张无忌-12", "周芷若-73", "赵敏-27", "张强-84", "张三丰-73", "张良-26", "王二麻子-26", "谢广坤-46");


        /*
        *参数一：流里面原本的数据类型
        *参数二：要转成之后的类型
        * s：依次表示流里面每一个数据
        * 返回值：表示转换之后的数据
         */
//        list5.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                String[] arr = s.split("-");//以“-”为切割
//                String ageString = arr[1];
//                int age = Integer.parseInt(ageString);
//                return age;
//            }
//        }).forEach(System.out::println);//此时流的类型是整数


//        list5.stream().map(s->Integer.parseInt(s.split("-")[1]) ).forEach(System.out::println);

        list5.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(System.out::println);

    }
}
