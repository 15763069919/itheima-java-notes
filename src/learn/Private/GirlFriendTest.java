package learn.Private;

public class GirlFriendTest {
    public static void main(String[] args) {
        //��ֵ

        GirlFriend gf = new GirlFriend();
        gf.setName("������");
        gf.setAge(17);
        gf.setGender("Ů");

        //���ñ�������
//        ѧϰ.String name =gf.getName();
//        int age = gf.getAge();
//        ѧϰ.String gender = gf.getGender();

        System.out.println(gf.getName());
        //ֱ�Ӵ�ӡ
        System.out.println(gf.getAge());
        System.out.println(gf.getGender());

        //��privateд��
//        gf.name = "������";
//        gf.age = 17;
//        gf.gender = "������";
//        System.out.println(gf.name);
//        System.out.println(gf.age);
//        System.out.println(gf.gender);
//
//        gf.sleep();
//        gf.eat();
    }
}
