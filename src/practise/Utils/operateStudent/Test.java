package practise.Utils.operateStudent;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("����",23,"��");
        Student s2 = new Student("����",24,"Ů");
        Student s3 = new Student("����",25,"�ֶ������ϴ�");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(studentUtil.oldest(list));;
    }
}
