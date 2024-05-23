package learn.Private;

public class GirlFriendTest {
    public static void main(String[] args) {
        //赋值

        GirlFriend gf = new GirlFriend();
        gf.setName("潘淑卿");
        gf.setAge(17);
        gf.setGender("女");

        //可用变量接收
//        学习.String name =gf.getName();
//        int age = gf.getAge();
//        学习.String gender = gf.getGender();

        System.out.println(gf.getName());
        //直接打印
        System.out.println(gf.getAge());
        System.out.println(gf.getGender());

        //无private写法
//        gf.name = "潘淑卿";
//        gf.age = 17;
//        gf.gender = "萌妹子";
//        System.out.println(gf.name);
//        System.out.println(gf.age);
//        System.out.println(gf.gender);
//
//        gf.sleep();
//        gf.eat();
    }
}
