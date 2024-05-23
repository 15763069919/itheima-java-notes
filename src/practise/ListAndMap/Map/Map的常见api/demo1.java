package practise.ListAndMap.Map.Map的常见api;

import java.util.HashMap;
import java.util.Map;

public class demo1 {
    public static void main(String[] args) {
        //1.创建Map集合的对象
        Map<String, String> m = new HashMap<>();

        //2.添加元素
        System.out.println("=========put===========");

        String put1 = m.put("郭靖", "黄蓉");
        System.out.println(put1);   //null
        String put2 = m.put("韦小宝", "沐剑屏");
        System.out.println(put2);   //null
        String put3 = m.put("尹志平", "小龙女");
        System.out.println(put3);   //null

        //覆盖并返回被覆盖的值
        String put4 = m.put("韦小宝", "双儿");
        System.out.println(put4);   //沐剑屏

        //3.打印集合
        System.out.println(m);  //{韦小宝=双儿, 尹志平=小龙女, 郭靖=黄蓉}


        //4.删除
        System.out.println("=========remove===========");

        System.out.println(m);
        String remove = m.remove("郭靖");
        System.out.println(remove);
        System.out.println(m);

        //5.清空
//        m.clear();

        //6.判断是否包含键
        System.out.println("=========containsKey===========");

        boolean result1 = m.containsKey("韦小宝");
        System.out.println(result1);    //true
        boolean result2 = m.containsKey("韦小宝2");
        System.out.println(result2);    //false

        //6.判断是否包含值
        System.out.println("=========containsValue===========");

        boolean result3 = m.containsValue("小龙女");
        System.out.println(result3);    //true
        boolean result4 = m.containsValue("小龙女2");
        System.out.println(result4);    //false

        //7.判断是否为空
        System.out.println("=========isEmpty===========");
        boolean empty = m.isEmpty();
        System.out.println(empty);  //false

        //8.获取长度
        System.out.println("=========size===========");
        int size = m.size();
        System.out.println(size);   //2

    }
}
