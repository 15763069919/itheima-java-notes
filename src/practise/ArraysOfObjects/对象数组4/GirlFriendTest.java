package practise.ArraysOfObjects.��������4;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend arr[] = new GirlFriend[4];

        arr[0] = new GirlFriend("Сʫʫ",18,"������","����ʳ");
        arr[1] = new GirlFriend("С����",19,"������","����Ϸ");
        arr[2] = new GirlFriend("С�ݻ�",20,"������","���飬ѧϰ");
        arr[3] = new GirlFriend("С����",21,"������","˯��");

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
