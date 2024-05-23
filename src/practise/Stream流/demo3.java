package practise.Stream��;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "���޼�", "������", "����", "��ǿ", "������", "����", "��������", "л����");

        //filter ����
        System.out.println("==================filter=====================");
        //
       /* list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {

                return s.startsWith("��");//����ֵ��ʾҪ���ǲ�Ҫ��ture���£�false����
            }
        }).forEach(System.out::println);*/

        //s��ʾ���λ�ȡÿһ������
        list.stream().filter(s -> s.startsWith("��")).forEach(System.out::println);

        //limit ��ȡǰ����Ԫ��
        //
        System.out.println("==================limit=====================");
        list.stream().limit(3).forEach(System.out::println);

        //skip ����
        //
        System.out.println("==================skip=====================");
        list.stream().skip(4).forEach(System.out::println);

        //distinct Ԫ��ȥ�أ�������hashCode��equals������
        //
        System.out.println("==================distinct=====================");
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "���޼�", "���޼�", "���޼�", "������", "����", "��ǿ", "������", "����", "��������", "л����");

        list1.stream().distinct().forEach(name -> System.out.println(name));


        //concat   �ϲ�a��b������Ϊһ����
        //
        System.out.println("==================concat=====================");
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        Collections.addAll(list3, "���޼�", "���޼�", "���޼�", "������", "����", "��ǿ", "������", "����", "��������", "л����");
        Collections.addAll(list4, "���޼�", "���޼�", "���޼�", "������", "����", "��ǿ", "������", "����", "��������", "л����");

        Stream.concat(list3.stream(), list4.stream()).forEach(System.out::println);

        System.out.println("==================map=====================");
        ArrayList<String> list5 = new ArrayList<>();
        Collections.addAll(list5, "���޼�-12", "������-73", "����-27", "��ǿ-84", "������-73", "����-26", "��������-26", "л����-46");


        /*
        *����һ��������ԭ������������
        *��������Ҫת��֮�������
        * s�����α�ʾ������ÿһ������
        * ����ֵ����ʾת��֮�������
         */
//        list5.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                String[] arr = s.split("-");//�ԡ�-��Ϊ�и�
//                String ageString = arr[1];
//                int age = Integer.parseInt(ageString);
//                return age;
//            }
//        }).forEach(System.out::println);//��ʱ��������������


//        list5.stream().map(s->Integer.parseInt(s.split("-")[1]) ).forEach(System.out::println);

        list5.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(System.out::println);

    }
}
