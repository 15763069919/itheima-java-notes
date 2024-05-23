package practise.ListAndMap.Map.HashMap.eg1;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo1 {
    public static void main(String[] args) {
        HashMap<Student,String> hashMap = new HashMap<>();

        Student s1 = new Student("zhangsan" ,23);
        Student s2 = new Student("lisi" ,24);
        Student s3 = new Student("wangwu" ,25);
        Student s4 = new Student("wangwu" ,25);

        hashMap.put(s1,"北京");
        hashMap.put(s2,"上海");
        hashMap.put(s3,"深圳");

        String result = hashMap.put(s4, "山东");

        System.out.println(result);

        Set<Student> students = hashMap.keySet();
        for(Student key:students){
            System.out.println(key+ "=" +hashMap.get(key));
        }
        System.out.println("--------------------------------");
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next+"="+hashMap.get(next) );
        }
        System.out.println("--------------------------------");
        students.forEach( student->System.out.println(student+ "=" + hashMap.get(student)));

        System.out.println("================================");

        Set<Map.Entry<Student, String>> entries = hashMap.entrySet();

        for(Map.Entry entry :entries){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println("--------------------------------");

        Iterator<Map.Entry<Student,String>> iterator1 = entries.iterator();
        while(iterator1.hasNext()){
            Map.Entry<Student, String> next = iterator1.next();
            System.out.println(next.getKey()+"="+next.getValue());
        }

        System.out.println("--------------------------------");

        entries.forEach( studentStringEntry->System.out.println(studentStringEntry.getKey() + "=" + studentStringEntry.getValue()));


        System.out.println("================================");

        hashMap.forEach((Student student, String s)-> {
                System.out.println(student + "=" + s);
            }
        );


    }
}
