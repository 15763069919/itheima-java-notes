package practise.ComprehensiveExercise.��Ҫ���������;

import java.util.Arrays;

public class ��Ҫ��������� {
    public static void main(String[] args) {
        GirlFriend girlFriend1 = new GirlFriend("xiaoshishi", 18, 1.67);
        GirlFriend girlFriend2 = new GirlFriend("xiaodandan", 19, 1.72);
        GirlFriend girlFriend3 = new GirlFriend("xiaohuihui", 19, 1.78);

        GirlFriend[] arr = {girlFriend1, girlFriend2, girlFriend3};

        /*//��Ҫ������
        Arrays.sort(arr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                double tmp = o2.getAge() - o1.getAge(); //������ͬ
                tmp = tmp == 0 ? o2.getHeight() - o1.getHeight() : tmp;   //������ͬ�����
                tmp = tmp == 0 ? o1.getName().compareTo(o2.getName()) : tmp;

                if (tmp > 0) return 1;
                else if (tmp < 0) return -1;
                else return 0;

            }
        });*/
        //��Ҫ������
        Arrays.sort(arr, (o1, o2) -> {
            double tmp = o2.getAge() - o1.getAge(); //������ͬ
            tmp = tmp == 0 ? o2.getHeight() - o1.getHeight() : tmp;   //������ͬ�����
            tmp = tmp == 0 ? o1.getName().compareTo(o2.getName()) : tmp;
            if (tmp > 0) {
                return 1;
            } else if (tmp < 0) {
                return -1;
            } else {
                return 0;
            }
        });


        /*//����������
        Arrays.sort(arr,(o1, o2) -> o2.getAge()- o1.getAge());

        //���������
        Arrays.sort(arr, (o1, o2) -> (int) (o2.getHeight()-o1.getHeight()));

        //��������ĸ����
        Arrays.sort(arr,((o1, o2) -> o2.getName().charAt(0)-o1.getName().charAt(0) ));
*/
        System.out.println(Arrays.toString(arr));
    }
}
