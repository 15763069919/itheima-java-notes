package practise.Utils.operateStudent;

import java.util.ArrayList;

public class studentUtil {
    private studentUtil (){}
    public static int oldest(ArrayList<Student> list){
        int max = list.get(0).getAge();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge()>max)
                max = list.get(i).getAge();
        }
        return max;
    }
}
