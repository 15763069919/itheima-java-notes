package practise.ArrayList.����û������ж��Ƿ����;

import java.util.ArrayList;

public class Test1���Test2 {
    public static void main(String[] args) {
        //�������϶���
        ArrayList<User> list = new ArrayList<>();
        //�����û�����
        User u1 = new User("001", "����", "123");
        User u2 = new User("002", "����", "123");
        User u3 = new User("003", "����", "123");
        //����û�����
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //�ж��Ƿ����
        System.out.println(isExists(list, "006"));

    }

    public static boolean isExists(ArrayList<User> list, String id) {
        /*for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;*/
        return checkUser(list,id) >= 0;

    }
    public static int checkUser(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.                            get(i).getId().equals(id)){
                return i;
            }
        }
        return 1;
    }
}
