package practise.genericity.���͵ļ̳��Ժ�ͨ���;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        method(list1);
//        method(list2);
//        method(list3);
    }
    // ǰ�治��˵��ָ�����͵ľ������ͺ󣬴�������ʱ�����Դ���������ͻ������������ͣ�
    public static void method(ArrayList<Ye> list){}
}

//class Ye<String>{}
//class Fu extends Ye{}
//class Zi extends Fu{}
