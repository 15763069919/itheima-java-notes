package practise.methodCite.���ó�Ա����;

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"���޼�","������","����","��ǿ","������");
        //��������
        list.stream().filter(new StringOperation()::stringJudge).forEach(System.out::println);
        list.stream().filter(new StringOperation()::stringJudge).forEach(System.out::println);



    }
}
class StringOperation{
    //��Ա����
    public boolean stringJudge(String s){
        return s.startsWith("��")&&s.length()==3;
    }
}