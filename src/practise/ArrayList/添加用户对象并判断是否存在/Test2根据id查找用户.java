package practise.ArrayList.����û������ж��Ƿ����;
/*
����id�����û������ڷ��������������ڷ���-1
 */
import java.util.ArrayList;

public class Test2����id�����û� {
    public static void main(String[] args) {
        //��������
        ArrayList<User> list = new ArrayList<>();
        //�����û�����
        User u1 = new User("001", "����", "123");
        User u2 = new User("002", "����", "123");
        User u3 = new User("003", "����", "123");
        //��ӽ�����
        list.add(u1);
        list.add(u2);
        list.add(u3);
        //��ѯ
        System.out.println(checkUser(list,"002"));
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
