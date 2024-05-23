package practise.ArrayList.添加用户对象并判断是否存在;
/*
需求：定义一个集合，添加用户对象，判断集合中是否存在指定的用户对象
要求：定义一个方法，根据id查找对应的用户信息，如果存在返回true，不存在返回false
 */

import java.util.ArrayList;

public class Test1根据id判断用户是否存在 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<User> list = new ArrayList<>();
        //创建用户对象
        User u1 = new User("001", "张三", "123");
        User u2 = new User("002", "李四", "123");
        User u3 = new User("003", "王五", "123");
        //添加用户对象
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //判断是否存在
        System.out.println(isExists(list, "006"));

    }

    public static boolean isExists(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
