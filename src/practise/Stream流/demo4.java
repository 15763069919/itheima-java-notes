package practise.Stream��;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class demo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "���޼�-12", "������-73", "����-27", "��ǿ-84", "������-73", "����-26", "��������-26", "л����-46");

        //forEach()
        /*
         * Consumer�ķ��ͣ���ʾ�������ݵ�����
         * accept�������βΣ����α�ʾStream�������ÿһ������
         * accept�����壺��ÿһ�����ݵĴ����������ӡ��
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


        //long count() ͳ��
        System.out.println("==============count==============");
        System.out.println(list.stream().count());  //8


        //toArray()     �ռ����ݣ��ŵ�������
        System.out.println("==============toArray==============");
        /*
         * IntFunction�ķ��ͣ��������͵�����
         * apply���βΣ��������ݵĸ�����Ҫ������ĳ��ȱ���һ��
         * ����ֵ���������͵�����
         * �����壺���Ǵ�������
         */
        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(list.stream().toArray(value -> new String[value])));


        //collect(Collector collector)      �ռ����е����ݣ��ŵ������У�List Set Map��
        System.out.println("==============collect==============");
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "���޼�-��-15", "������-Ů-14", "����-Ů-13", "��ǿ-��-20", "������-��-100", "�Ŵ�ɽ-��-40", "����-��-35", "��������-��-37", "л����-��-41");

        //�ռ��������Ե�list��  --  ����ȥ��
        List<String> l = list1.stream().filter(s -> "��".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(l);

        //�ռ��������Ե�Set��   --  ��ȥ��
        Set<String> set = list1.stream().filter(s -> "��".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(set);

        //�ռ��������Ե�Map��
        //����������ֵ������
        System.out.println("================Map1=================");
        /*
        * toMap(���Ĺ���(function(�����������ͣ�������)),ֵ�Ĺ���(������������,ֵ����������)))
        *
        *
        * toMap :
        *   ����һ���������ɹ���        Function   ����һ����ʾ����ÿһ�����ݵ�����
        *
        *                                       ���Ͷ�����ʾMap�����м�����������
        *
        *                                       ����apply���βΣ����α�ʾ�������ÿһ������
        *                                                 �����壺���ɼ��Ĵ���
        *                                                 ����ֵ���Ѿ����ɵļ�
        *   ��������ֵ�����ɹ���     Function ����һ�����е�ÿһ�����ݵ�����
        *
        *                                  ���Ͷ�����ʾMap�м�����������
        *
        *                                  ����apply���βΣ����α�ʾ�������ÿһ������
        *                                            �����壺����ֵ�Ĵ���
        *                                            ����ֵ���Ѿ����ɵ�ֵ
         */



        Map<String, Integer> map = list1.stream()
                .filter(s -> "��".equals(s.split("-")[1]))
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
                .filter(s -> "��".equals(s.split("-")[1]))
                .collect(Collectors
                        .toMap(s -> s.split("-")[0]
                                , s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(map2);
    }
}
