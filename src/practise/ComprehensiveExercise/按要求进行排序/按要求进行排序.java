package practise.ComprehensiveExercise.按要求进行排序;

import java.util.Arrays;

public class 按要求进行排序 {
    public static void main(String[] args) {
        GirlFriend girlFriend1 = new GirlFriend("xiaoshishi", 18, 1.67);
        GirlFriend girlFriend2 = new GirlFriend("xiaodandan", 19, 1.72);
        GirlFriend girlFriend3 = new GirlFriend("xiaohuihui", 19, 1.78);

        GirlFriend[] arr = {girlFriend1, girlFriend2, girlFriend3};

        /*//按要求排序
        Arrays.sort(arr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                double tmp = o2.getAge() - o1.getAge(); //年龄相同
                tmp = tmp == 0 ? o2.getHeight() - o1.getHeight() : tmp;   //年龄相同比身高
                tmp = tmp == 0 ? o1.getName().compareTo(o2.getName()) : tmp;

                if (tmp > 0) return 1;
                else if (tmp < 0) return -1;
                else return 0;

            }
        });*/
        //按要求排序
        Arrays.sort(arr, (o1, o2) -> {
            double tmp = o2.getAge() - o1.getAge(); //年龄相同
            tmp = tmp == 0 ? o2.getHeight() - o1.getHeight() : tmp;   //年龄相同比身高
            tmp = tmp == 0 ? o1.getName().compareTo(o2.getName()) : tmp;
            if (tmp > 0) {
                return 1;
            } else if (tmp < 0) {
                return -1;
            } else {
                return 0;
            }
        });


        /*//按年龄排序
        Arrays.sort(arr,(o1, o2) -> o2.getAge()- o1.getAge());

        //按身高排序
        Arrays.sort(arr, (o1, o2) -> (int) (o2.getHeight()-o1.getHeight()));

        //按姓名字母排序
        Arrays.sort(arr,((o1, o2) -> o2.getName().charAt(0)-o1.getName().charAt(0) ));
*/
        System.out.println(Arrays.toString(arr));
    }
}
