package practise.methodCite.引用成员方法;

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");
        //方法引用
        list.stream().filter(new StringOperation()::stringJudge).forEach(System.out::println);
        list.stream().filter(new StringOperation()::stringJudge).forEach(System.out::println);



    }
}
class StringOperation{
    //成员方法
    public boolean stringJudge(String s){
        return s.startsWith("张")&&s.length()==3;
    }
}