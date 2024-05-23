package practise.Stream流;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class demo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-12", "周芷若-73", "赵敏-27", "张强-84", "张三丰-73", "张良-26", "王二麻子-26", "谢广坤-46");

        //forEach()
        /*
         * Consumer的泛型：表示流中数据的类型
         * accept方法的形参：依次表示Stream流里面的每一个数据
         * accept方法体：对每一个数据的处理操作（打印）
         *
         */
        System.out.println("==============forEach==============");
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

//        list.stream().forEach(s-> System.out.println(s));


        //long count() 统计
        System.out.println("==============count==============");
        System.out.println(list.stream().count());  //8


        //toArray()     收集数据，放到数组中
        System.out.println("==============toArray==============");
        /*
         * IntFunction的泛型：具体类型的数组
         * apply的形参：流中数据的个数，要跟数组的长度保持一致
         * 返回值：具体类型的数组
         * 方法体：就是创建数组
         */
        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(list.stream().toArray(value -> new String[value])));


        //collect(Collector collector)      收集流中的数据，放到集合中（List Set Map）
        System.out.println("==============collect==============");
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20", "张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");

        //收集所有男性到list中  --  不会去重
        List<String> l = list1.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(l);

        //收集所有男性到Set中   --  会去重
        Set<String> set = list1.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(set);

        //收集所有男性到Map中
        //键：姓名，值：年龄
        System.out.println("================Map1=================");
        /*
        * toMap(键的规则(function(流中数据类型，键类型)),值的规则(流中数据类型,值的数据类型)))
        *
        *
        * toMap :
        *   参数一：键的生成规则        Function   泛型一：表示流中每一个数据的类型
        *
        *                                       泛型二：表示Map集合中键的数据类型
        *
        *                                       方法apply：形参：依次表示流里面的每一个数据
        *                                                 方法体：生成键的代码
        *                                                 返回值：已经生成的键
        *   参数二：值的生成规则     Function 泛型一：流中的每一个数据的类型
        *
        *                                  泛型二：表示Map中键的数据类型
        *
        *                                  方法apply：形参：依次表示流里面的每一个数据
        *                                            方法体：生成值的代码
        *                                            返回值：已经生成的值
         */



        Map<String, Integer> map = list1.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
                                              @Override
                                              public String apply(String s) {
                                                  return s.split("-")[0];
                                              }
                                          },
                        new Function<String, Integer>() {
                            @Override
                            public Integer apply(String s) {
                                return Integer.parseInt(s.split("-")[2]);
                            }
                        }));
        System.out.println(map);


        System.out.println("================Map1=================");
        Map<String, Integer> map2 = list1.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors
                        .toMap(s -> s.split("-")[0]
                                , s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(map2);
    }
}
