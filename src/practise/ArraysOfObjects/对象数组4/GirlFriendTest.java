package practise.ArraysOfObjects.对象数组4;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend arr[] = new GirlFriend[4];

        arr[0] = new GirlFriend("小诗诗",18,"萌妹子","吃零食");
        arr[1] = new GirlFriend("小丹丹",19,"萌妹子","玩游戏");
        arr[2] = new GirlFriend("小惠惠",20,"萌妹子","看书，学习");
        arr[3] = new GirlFriend("小莉莉",21,"憨妹子","睡觉");

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getAge();
        }

        double avg = sum / arr.length;
        System.out.println(avg);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getAge()<avg){
                count++;
                System.out.println(arr[i].getName()+","+arr[i].getAge()+","+arr[i].getGender()+","+arr[i].getHobby());
            }
        }
        System.out.println(count);
    }
}
